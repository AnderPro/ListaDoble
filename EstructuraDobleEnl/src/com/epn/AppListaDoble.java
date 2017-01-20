package com.epn;

import java.awt.Component;

import javax.swing.JOptionPane;

public class AppListaDoble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		
		ListaDobleEnl listad= new ListaDobleEnl();
		 int opcion=0;
		String elemento;
		 
		 do{
			 try{
				opcion =Integer.parseInt(JOptionPane.showInputDialog(null,
				 "1.Insertar al inicio \n"
				 +"2. Insertar al final \n "
				 +"3. Mostrar la lista de inicio a fin\n"
				 +"4. Buscar por dato\n"
				 +"5.Buscar por inicie\n"
				 +"6. Eliminar\n"
				 +"7.salir"
				 +"Menu de Opciones",JOptionPane.INFORMATION_MESSAGE));
				
				switch(opcion){
				case 1:
					elemento=JOptionPane.showInputDialog("Ingrese el dato al inicio",JOptionPane.INFORMATION_MESSAGE);
					listad.agregarinicio(elemento);
					
					
					break;
				case 2:
					elemento=JOptionPane.showInputDialog("Ingrese el dato al final",JOptionPane.INFORMATION_MESSAGE);
					listad.agregarfinal(elemento);
					break;
				case 3:
					System.out.println(listad.mostrarlistardeiniciofin());
					JOptionPane.showMessageDialog(null, "Lista de inicio a fin:\n"+listad.mostrarlistardeiniciofin());
					
					
					break;
				case 4:
					
					String datoBuscar=JOptionPane.showInputDialog("Ingrese el dato a buscar");
				
					if(listad.buscarporDato(datoBuscar)!=null){
					JOptionPane.showMessageDialog(null, listad.buscarporDato(datoBuscar));}
					else{
						JOptionPane.showMessageDialog(null, "NO existe");}
					
					
					
					break;
				case 5:
					
					int indice=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el indice a buscar:"));
					
					if(listad.buscarporIndice(indice)!=null){
						JOptionPane.showMessageDialog(null, listad.buscarporIndice(indice));}
					else{
						JOptionPane.showMessageDialog(null, "no existe");
						
					}
					break;
					
				case 6:
					int indice2=Integer.parseInt(JOptionPane.showInputDialog("nodo a Eliminar::"));
					
					listad.Eliminar(listad, indice2);
					
					JOptionPane.showMessageDialog(null, "Lista de inicio a fin:\n"+listad.mostrarlistardeiniciofin());

					break;
				case 7:
					JOptionPane.showMessageDialog(null, "Aplicacion fin","FIn",JOptionPane.INFORMATION_MESSAGE);
					break;
				default:
					JOptionPane.showMessageDialog(null, "OPcion no valida","Error",JOptionPane.INFORMATION_MESSAGE);
				
				}
				 
			 }catch(NumberFormatException n){
				 JOptionPane.showMessageDialog(null, "erroe"+n.getMessage());
			 }
			 	
			 
		 }while(opcion!=7);
		 
	}

}
