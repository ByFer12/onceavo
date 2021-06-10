public class onceavo {
    public static void main(String[] args) {
        int numero;
	    int aux1=0,aux2=0,aux3=0,auxi3=0,aux4=0,aux6=0;
        int cantidad=0;
        double aux5=0;
    while(cantidad<=10){
	numero=(int)(Math.random()*36+1);
	if(numero%2!=0){
		aux1++;
	}else if(numero%2==0){
		aux2++;
    }else if(numero>12 && numero<25){
		auxi3++;
	}
    else if(numero>aux4){
            aux4=numero;
	
    }
    cantidad++;
		
	}

    aux5=10/aux2;
    System.out.println("La cantidad de impares son: "+aux1);
    System.out.println("El promedio de pares es: "+aux5);
    System.out.println("Cantidad de números que se encuentran en la 2da docena (13 al 24): "+aux3);
    System.out.println("El numero mayor es: "+aux4);
	
    }
    
}
