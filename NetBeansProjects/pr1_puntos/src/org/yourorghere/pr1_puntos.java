package org.yourorghere;

import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLEventListener;

//Para el manejo de libreria GLU:
import javax.media.opengl.glu.GLU;

//Necesaria para el manejo de ventanas en Java
import javax.swing.JFrame;

public class pr1_puntos extends JFrame{        
   
public pr1_puntos() {
//Establece el ancho y alto de nuestra ventana de visualización
this.setSize(600,600);
    	
//Establece la posición de la esquina superior izquierda de la ventana de visualización
this.setLocation(350,150);
    	
//Establece el nombre de la ventana
this.setTitle("Práctica 1: Creacion de puntos");
    	
//Creamos una instancia de la clase GraphicListener:
GraphicListener listener = new GraphicListener();
    	
//Agregamos los listener a nuestyro canvas
GLCanvas canvas = new GLCanvas(new GLCapabilities());
canvas.addGLEventListener(listener);
getContentPane().add(canvas);
}// constructor
       
public static void main(String[] args) {
pr1_puntos miVentana = new pr1_puntos();
miVentana.setVisible(true);
miVentana.setDefaultCloseOperation(EXIT_ON_CLOSE);
}// main
    
public class GraphicListener implements GLEventListener{
public void display (GLAutoDrawable arg0){
//inicializa la libreria GLU
GLU glu = new GLU();
    		
//inicializamos la libreria GL
GL gl = arg0.getGL();
    		
// Establece el color de fondo de la ventana de visualización en Negro
// Recuerda que estamos trabajando en el modelo de color RGB.
// En graficación, al modelo RGB, se le aumenta un Canal, por lo que nos queda:
// RGB-A, donde A es el canal Alpha, el cual nos permite manejar un nivel
// de opacidad en la ventana.    		
gl.glClearColor(0.0f, 0.0f, 0.0f,0.0f);
			
//Indicamos que hay una proyección
gl.glMatrixMode(GL.GL_PROJECTION);
// Indicamos el tipo de proyección, así como sus propiedades.
// Las proyecciones las tomamos de la libreria GLU
glu.gluOrtho2D(0.0f, 200.0f, 0.0f, 150.0f);
			
//Limpiamos el buffer de nuestra pantalla
gl.glClear(GL.GL_COLOR_BUFFER_BIT);    		
				
// Establece el color a dibujar en rojo:
gl.glColor3f(1.0f, 0.0f, 0.0f);
					
//Indicamos el tamaño en pixeles de los puntos:
gl.glPointSize(10);
			
// Indicamos que iniciamos a crear una línea:
gl.glBegin(GL.GL_POINTS);
//Establecemos la posición del primer punto
gl.glVertex2i(180,15);
				
//Establecemos la posición del segundo punto
gl.glVertex2i(10,145);
			
//Indicamos que hemos terminado de dibujar puntos			
gl.glEnd();
			
//Mandamos a graficar a pantalla.
gl.glFlush();
}//display...    
    
public void displayChanged(GLAutoDrawable arg0, boolean arg1, boolean arg2){}
public void init(GLAutoDrawable arg0){
GL gl =arg0.getGL();
gl.glEnable(GL.GL_BLEND);
gl.glBlendFunc(GL.GL_SRC_ALPHA, GL.GL_ONE_MINUS_SRC_ALPHA);
}// init.
    
public void reshape(GLAutoDrawable arg0, int arg1,int arg2, int arg3, int arg4){}
    	
}//display...    
}// pr1_puntos
