package com.fran.resources;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

	/**
	 * El m�todo onCreate es el m�todo que se llama siempre al inicio
	 * de una activity, en este m�todo siempre se llama primer al m�todo
	 * padre.
	 * 
	 * La segunda linea del m�todo carga como contenido de la activity, el 
	 * layout que acabamos de definir. Como vemos, el layout se referencia
	 * haciendo uso de la clase R 
	 */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /** En este punto vamos a ejecutar nuestra activity para ver 
         * lo que hemos creado
         */
        
        /** 
         * Ahora vamos a ver como referenciar uno de nuestros componentes
         * de la UI, y como vosotros sois chicos audaces, ya sabreis que es
         * de nuevo a trav�s de la clase R que contiene referencias a todos los
         * elementos definidos en nuestros recursos
         */
        
        //Referenciamos a nuestro textview llamando al m�todo 
        //findViewById y referenciandolo por su id (descomenta la linea...)
        
        TextView tv = (TextView)this.findViewById(R.id.text1);
        
        //Con la referencia a nuestro TextView, podemos por ejemplo, cambiar el 
        //texto (Descomenta la linea)
        
        
        tv.setText("Ponemos este otro texto");
    }

    
}
