package com.example.practica1_kotlin

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import com.example.practica1_kotlin.Instrucciones.ErrorObjeto
import com.example.practica1_kotlin.Objetos.Barras
import com.example.practica1_kotlin.Objetos.Grafica
import com.example.practica1_kotlin.Objetos.Pie
import com.example.practica1_kotlin.Principal.Controlador
import com.github.mikephil.charting.charts.PieChart
import com.github.mikephil.charting.charts.BarChart
import com.github.mikephil.charting.components.Legend
import com.github.mikephil.charting.components.LegendEntry
import com.github.mikephil.charting.data.*
import com.github.mikephil.charting.utils.ColorTemplate

const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"
class MainActivity : AppCompatActivity() {

    var erroresBoton: Button ?= null
    var noGraficas: Button ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        erroresBoton = findViewById(R.id.erroresBoton)
        noGraficas = findViewById(R.id.noGraficas)
    }

    fun enviarMensaje(texto:String) {

        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, texto)
        }
        startActivity(intent)
    }

    fun analizar(view: View){
        val layout1 = findViewById<LinearLayout>(R.id.layout1)
        layout1.removeAllViewsInLayout()
        val editText = findViewById<EditText>(R.id.editTextTextMultiLine)
        val texto:String = editText.text.toString()
        val controlador:Controlador = Controlador()
        controlador.analizar(texto)

        val graficas:ArrayList<Grafica> = controlador.graficas
        val errores:ArrayList<ErrorObjeto> = controlador.errores

        verificarGraficar(graficas, errores)
    }

    fun verificarGraficar(grafica:ArrayList<Grafica>, errores:ArrayList<ErrorObjeto>) {
        var graficasPie:Int = 0
        var graficasBarra:Int = 0
        var string:String = ""
        for (graficaTemp in grafica) {
            if (graficaTemp is Barras) {
                graficarBarra(graficaTemp)
                graficasBarra++
            } else if (graficaTemp is Pie) {
                graficarPie(graficaTemp)
                graficasPie++
            }
        }

if(errores.size == 0){
    string = "Graficas de Pie: "+graficasPie+"\nGraficas de Pie: "+graficasBarra
    noGraficas!!.setOnClickListener{enviarMensaje(string)}
}else{
    for (error in errores){
        string = string+"\nLexema: "+error.lexema+"\nLinea: "+error.fila+"\nColumna: "+error.columna+"\nTipo: "+error.tipoError+"\nDescripcion"+error.mensaje+"\n\n"
    }
    erroresBoton!!.setOnClickListener{enviarMensaje(string)}
}

    }

    private fun graficarPie(pie: Pie) {
        val pieChart = PieChart(this)
        val unirX:ArrayList<String> = pie.unirx
        val unirY:ArrayList<String> = pie.uniry
        val etiquetas:ArrayList<String> = pie.etiquetas
        val valores:ArrayList<String>  = pie.valores
        var total:Double = pie.total
        val extra:String = pie.extra
        val tipo:String = pie.tipo

        val ejeyVal = ArrayList<Double>()
        val ejexVal = ArrayList<String>()
        for (i in 0 until unirX.size){
            //Se asignan los elementos del conjunto X al conjunto Y usando las instrucciones de
            //Unir:[{ }]
            ejeyVal.add((valores[unirY[i].toInt()]).toDouble())
            ejexVal.add((etiquetas[unirX[i].toInt()]))
            Log.i("error","EL TAMA??O DE UNIR ES:"+unirX.size)
        }
        Log.e("error","EL TAMA??O DE EJEX ES: "+ejexVal.size)



        if (tipo.equals("\nPorcentaje\n")){
            total = 100.0
        }

        var entradas = ArrayList<PieEntry>()
        if (valores.size == etiquetas.size){
            var x:Int = 0
            for (i in 0 until valores.size){
                var temp:PieEntry = PieEntry(valores.get(i).toFloat(),etiquetas.get(i))
                x = x + valores.get(i).toInt()
                entradas.add(temp)
            }
            if ((total-x)>0){
                var temp:PieEntry = PieEntry((total-x).toFloat(),extra)
                entradas.add(temp)
            }
        }

        val pieDataSet:PieDataSet = PieDataSet(entradas,"")
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS,255)
        pieDataSet.setValueTextColor(Color.BLACK)
        pieDataSet.setValueTextSize(16f)

        val pieData:PieData = PieData(pieDataSet)
        pieChart.setData(pieData)
        pieChart.getDescription().setText(pie.titulo)
        pieChart.animateY(1500)
        val layout1 = findViewById<LinearLayout>(R.id.layout1)
        layout1.addView(pieChart)
        pieChart.layoutParams.height = 500

    }

    fun graficarBarra(barra:Barras){
            val barChart = BarChart(this)
            val titulo:String = barra.titulo
            val unirX:ArrayList<String> = barra.unirx
            val unirY:ArrayList<String> = barra.uniry
            val ejesx:ArrayList<String> = barra.ejesx
            val ejesy:ArrayList<String>  = barra.ejesy
            val ejeyVal = ArrayList<Double>()
            val ejexVal = ArrayList<String>()
            for (i in 0 until unirX.size){
                //Se asignan los elementos del conjunto X al conjunto Y usando las instrucciones de
                //Unir:[{ }]
                ejeyVal.add((ejesy[unirY[i].toInt()]).toDouble())
                ejexVal.add((ejesx[unirX[i].toInt()]))
                Log.i("error","EL TAMA??O DE UNIR ES:"+unirX.size)
            }
            Log.e("error","EL TAMA??O DE EJEX ES: "+ejexVal.size)
            var entradas = ArrayList<BarEntry>()
            var leyendas = ArrayList<LegendEntry>()
            for (i in 0 until ejexVal.size){
                /*Aqui se usan las listas nuevas para a??adir entradas a la grafica
                tambien se usan las "Leyendas" para mostrar las etiquetas
                * */
                entradas.add(BarEntry(i.toFloat(),ejeyVal.get(i).toFloat()))
                val temp = LegendEntry()
                temp.formColor = ColorTemplate.MATERIAL_COLORS[i]
                temp.label = ejexVal.get(i);
                leyendas.add(temp)
            }

            //Se ajusta el aspecto de las leyendas, es opcional, hace que se vean abajo
            val legend = barChart.legend
            legend.form = Legend.LegendForm.CIRCLE
            legend.horizontalAlignment = Legend.LegendHorizontalAlignment.CENTER
            legend.setCustom(leyendas)
            legend.textSize = 16.toFloat()

            //Se crea un bar data set para el grafico
            val barDataSet = BarDataSet(entradas,"")
            barDataSet.setColors(ColorTemplate.MATERIAL_COLORS,200)
            barDataSet.setValueTextColor(Color.WHITE)
            barDataSet.valueTextSize = 16.toFloat()

            val barData = BarData(barDataSet)
            barChart.setFitBars(true)
            barChart.setData(barData)
            //Aqui deberia ir el titulo pero ya que
            barChart.getDescription().setText(titulo)
            barChart.animateY(1500)


            //Se ajusta el tama??o de la cuadricula en el eje x para que no muestre
            //numeros decimales

            barChart.xAxis.granularity = 1.toFloat()
        val layout1 = findViewById<LinearLayout>(R.id.layout1)
        layout1.addView(barChart)
        barChart.layoutParams.height = 500
        }

    }
