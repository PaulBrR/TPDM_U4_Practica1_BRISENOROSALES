package paulbriseno.ittepi.edu.mx.tpdm_u4_practica1_brisenorosales

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(LienzoNavidad(this)) //invoca por defual el XML
    }
}
