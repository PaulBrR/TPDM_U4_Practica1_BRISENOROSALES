package paulbriseno.ittepi.edu.mx.tpdm_u4_practica1_brisenorosales


import android.graphics.BitmapFactory
import android.view.View

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint

class LienzoNavidad(nav:MainActivity) :View(nav){ //SURFE VIEW  / VIEW
    var imagen = BitmapFactory.decodeResource(resources,R.drawable.solecito)

    override fun onDraw(c: Canvas) {
        super.onDraw(c)
        val p = Paint()
        val w=Paint()

        // APLICACIoNES MULTIMEDIA

        setBackgroundColor(Color.rgb(55f,16f,55f))
        //RGBToHSV(25f,28f,50f,))
        p.color = Color.GREEN
        p.textSize=35f
        //.textSize y otras como Strokes lineas y demas
        c.drawText("Briseno Rosales ",20f,100f,p)


        p.style= Paint.Style.STROKE                           //Montania izquierda
        p.strokeWidth=60f

        p.color=Color.WHITE
        c.drawCircle(-100f, 1350f ,1100f,p)

        p.style= Paint.Style.FILL
        p.color=Color.CYAN

        c.drawCircle(-100f, 1350f ,1100f,p)

        p.style= Paint.Style.STROKE                              //Montania Derecha
        p.strokeWidth=50f

        p.color=Color.WHITE
        c.drawCircle(1800f, 1350f ,1100f,p)

        p.style= Paint.Style.FILL
        p.color=Color.CYAN
        c.drawCircle(1800f, 1350f ,1100f,p)


        //ARbol izquierdo
        p.color=Color.DKGRAY
        c.drawRect(170f,680f,250f,800f,p)
        p.color=Color.GREEN
        c.drawCircle(200f,500f,100f,p)
        c.drawCircle(200f,600f,100f,p)

                                                                    //REGALO
        p.style= Paint.Style.STROKE                              //Montania Derecha
        p.strokeWidth=8f
        p.color=Color.YELLOW
        c.drawCircle(300f,700f,26f,p)
        c.drawCircle(345f,700f,26f,p)

        p.style= Paint.Style.FILL
        p.color=Color.RED
        c.drawRect(270f,699f,380f,800f,p)
        p.color=Color.YELLOW
        c.drawRect(270f,735f,380f,750f,p)//Horizontal
        c.drawRect(315f,699f,330f,800f,p)




        //ARBOL DERECHO
        p.color=Color.DKGRAY
        c.drawRect(1565f,680f,1630f,800f,p)
        p.color=Color.GREEN
        c.drawCircle(1580f,500f,100f,p)
        c.drawCircle(1580f,600f,100f,p)
        c.drawCircle(1480f,540f,50f,p)
        c.drawCircle(1480f,620f,65f,p)
        c.drawCircle(1680f,540f,65f,p)
        c.drawCircle(1680f,600f,50f,p)


        //NUBES

        p.color=Color.WHITE
        c.drawCircle(400f,100f,80f,p)           //IZQUIERDA
        c.drawCircle(400f,200f,80f,p)
        c.drawCircle(300f,150f,50f,p)
        c.drawCircle(300f,220f,65f,p)
        c.drawCircle(500f,140f,65f,p)
        c.drawCircle(500f,200f,50f,p)



        c.drawCircle(500f,100f,80f,p)           //DERECHA
        c.drawCircle(500f,200f,80f,p)
        c.drawCircle(400f,150f,50f,p)
        c.drawCircle(400f,220f,65f,p)
        c.drawCircle(600f,140f,65f,p)
        c.drawCircle(600f,200f,50f,p)

                                                    //MONO DE NUEVE cara sombrero
        p.strokeWidth=8f

        c.drawCircle(1262f,660f,60f,p)
        c.drawCircle(1262f,770f,80f,p)


                                                            //CARA Mono de nieve
        p.color=Color.BLACK
        c.drawLine(1250f,690f,1280f,690f,p)


        p.color=Color.argb(25f,20f,128f,0f)
        c.drawLine(1250f,665f,1330f,670f,p) //NARIZ
        c.drawLine(1250f,675f,1330f,670f,p)


        p.color=Color.BLACK
        p.strokeWidth=15f
        c.drawLine(1260f,750f,1270f,750f,p)//BTONES
        c.drawLine(1260f,770f,1270f,770f,p)

        c.drawLine(1220f,640f,1245f,650f,p)//OJOS
        c.drawLine(1280f,640f,1305f,650f,p)

                                                                    //manos
        p.strokeWidth=10f
        c.drawLine(1100f,670f,1190f,750f,p)//Izquierda
        c.drawLine(1100f,690f,1120f,670f,p)
        c.drawLine(1330f,750f,1370f,650f,p)//Derecha
        c.drawLine(1350f,660f,1380f,670f,p)

        //sombrero

        c.drawRect(1200f,590f,1310f,620f,p)
        p.color=Color.BLACK
        c.drawRect(1230f,550f,1290f,610f,p)

        p.color=Color.RED
        c.drawRect(1230f,590f,1290f,600f,p)

        c.drawBitmap(imagen,1500f, 30f ,p)              //SOL



        //ARGB  A: eS canal Alfa que como transparente similiar aotro color
    }

}
