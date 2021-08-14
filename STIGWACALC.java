package GWA;
import java.util.Scanner;

public class GWA {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("STI GWA Calculator\n[Press 123 to back] \n************\n");
String crd[]={"in","dr","h","id","Al","ad","Tr","ic"};
String CN[]={"Prelims", "Midterm", "Prefinals","finals" };
int hee = 0;
int tgl=1;
int hon=1;
int o=0;
int fon=1;
int i=0;
int q=0;
int opk=0;
int h=1;
int j=0;
int t=0;
int m=0;
int x=0;
int pot=1;
int lop=1;
int hek1=1;
int kop=0;
int rt=0;
int hop=1;
int hep=1;
int c=1;
int w=0;
int nok=1;
int of=1;
int h2=0;
int poh=1;
double Do=0;
double Ko=0;
double calc[]={.20,.20,.20,.40};
double over[]={20, 20, 20, 40};
boolean validInput = false;
boolean truet=true;
boolean pen=false;
boolean kon=true;
boolean qwa=true;
boolean loc=true;

do{
  int times=4*hee;
  String name[]=new String[hek1];
  double ent[]=new double[hee];
  double period[]=new double[hee];
  double pe[]=new double[hee];
  double cd[][]=new double[times][times];
  double conv[][]=new double[times][times];
  double total[]=new double[hee];
  
  do{
   rt++;
   boolean zen=true; 
 if(tgl==1&&rt==1){
    while(!validInput) {
        try {
            System.out.print("Enter no.of courses: ");    
            hee= sc.nextInt();                      
            if(hee==123){
                rt--;
                kop--;
                opk--;
                pot--;
            }else{
                validInput = true;
              hek1=hee+1;
              lop=4*hee; 
              tgl=2;
            }
        }catch(Exception e) {
            System.out.println("Please enter an integer!");
            validInput=false;
            sc.next();
        }
  }
} else if(tgl==2&&rt==2){              
System.out.println("Enter names of courses: ");
boolean Tog=false;
while(!Tog){
if(hop<=hee){   
    System.out.print(hep +": ");     
    name[i]=sc.next();  
    tgl=3;
    if(name[i].equals("123")){
      System.out.println("repeat success!");
        
        if(c==1){
            hep=1;      
            hop+=hee+1;
            Tog=true;
            tgl=1;
            rt=-1;
            hek1=0;
            hee=0;
            c=0;
            truet=true;
            opk=1;
            pot=0;
            lop=1;
            kop=-1;
            fon=1;
            validInput=false;
        }else if(c>1){
            hep--;
            hop--;
            i--;
            c--;
        }else{
          }
    }else{        
    if(hop<hee){
     hep++;
     i++;
     c++;
     hop++;
    }else{
     hop++;
     }
     }
   }else{
    Tog=true;
    continue;
    }
   }
    hop=1;
    c=1;
    i=0;
  }else if(tgl==3&&rt==3){
    hon=1;
    hek1=hee+1;
    System.out.println("Enter Units:");
do{
   if(nok<=hee){
      try {
         
          System.out.print(poh +"= ");
          ent[w]=sc.nextDouble();
            if(ent[w]==123 && w==0){
              System.out.println("repeat success!");
              of=hee+1;
              nok=hee+1;
              rt=1;
              tgl=2;
              h2=hee;                                 
              hop=hee;
              i+=hee-1;              
              c=hee;
              w=0;
              poh=1;
              lop=4*hee;
              pot=1;
            }else if (w>0 && ent[w]==123){
              System.out.println("repeat success!");
              w--;
              Do-=ent[w];
              nok--;
              poh--;
              of--;
              h2--;
              tgl=3;
            }else{
              tgl=4;
              Do+=ent[w];        
              poh++;
              of++;
              nok++;
              w++;     
              h2++;
            }
        }catch(Exception e) {
            System.out.println("Please enter an integer!" );
            sc.next();
            tgl=3;
        }          
    }else{
    of++;
    tgl=4;
    }    
 } while(h2<hee);
    nok=1;
    of=1;
    h2=0;   
} else if(tgl==4&&rt==4){   
h=1;
do{    
    if(h<=hee){
        x=0;
        int z=1;     
        boolean toggle=false;
        boolean swt=false;
        boolean clk=true;
         if(pen){         
            x+=3;
            z=4;
            pen=false;
            h=hee;     
         }else{       
          }
System.out.println("\n"+name[m]+"\n———————————————————");
m++;

     while(z<=4){
          try{
              System.out.print("Enter " + CN[x]+"= ");                 
              cd[j][j]=sc.nextDouble();  
              swt=false;
              toggle=false;
            if(cd[j][j]==123){           
                if(cd[j][j]==123&&z==1&&h>1){
                System.out.println("repeat success!\n-------------------\n\n");              
                m-=2;               
                System.out.print(name[m]+"\n———————————————————\n");
                swt=true;
                toggle=true;
                t=h-2;
                System.out.println("t: " + t);
                j--;
                total[t]-=conv[j][j];                    
                m++;
                z+=3;
                x=3;
                h--;
                q--;
                hon=1;
                o--;
                Ko-=pe[t]; 

              }else if(cd[j][j]==123&&z==1&&h==1){
               System.out.println("repeat success!\n-------------------");
               toggle=true;
               tgl=3;
               rt=2;
               j=0;
               x=0;
               hek1=0;
               z=5;
               w--;
               Do-=ent[w];
               o=0;
               q=0;
               of+=hee-1;
               nok+=hee-1;
               h2+=hee-1;
               poh--;
               zen=false;
               m--;
               lop=4*hee-1;
               pot=1;
               hon=2;
               kon=false;       
               }else{
               System.out.println("repeat success!\n-------------------");
               toggle=true;                                                                                                                  
               z--;         
               x--;             
               j--;
               total[t]-=conv[j][j]; 
               }
           }else if(cd[j][j]>=101.00||cd[j][j]>=100.01){
             System.out.println("No more 100+");
             swt=true;
             toggle=true;
           }else{
             toggle=false;
             swt=false;
           } 
           if(!toggle){
           conv[j][j]=cd[j][j]* calc[x];
           System.out.printf("%.2f", conv[j][j]);
           System.out.print("% - ");
           System.out.printf("%.2f", over[x]);
           System.out.print("%\n");       
           total[t]+=conv[j][j];
         }else if(toggle){
           toggle=false;
           continue;
         }else{        
         }
           
      if(calc[x]==.20&&!swt){
      System.out.println("-------------------");
      x++;
      j++;
      z++;
     }else if(calc[x]==.40&&!swt){
      z++;
      j++;   
     }else{
      continue;
     }            
      
 }catch(Exception e){
    System.out.println("Please enter an integer!");
    sc.next();
            
 }
}
    
 if(zen){
   System.out.printf("———————————————————\nTotal Average= %.2f", total[t]);         
   System.out.print("\n———————————————————\nEquivalency= ");
   h++;
   o++;
   z=1;

 
if(total[t]>=97.50&&total[t]<=100&&o<=hee){
   System.out.println("1.00\n");
   period[t]=1.00;
   t++;
}else if(total[t]>=94.50&&total[t]<=97.49&&o<=hee){
   System.out.println("1.25\n");
   period[t]=1.25;
   t++;
}else if(total[t]>=91.50&&total[t]<=94.49&&o<=hee){
   System.out.println("1.50\n");
   period[t]=1.50;
   t++;
}else if(total[t]>=88.50&&total[t]<=91.49&&o<=hee){
   System.out.println("1.75\n");
   period[t]=1.75;
   t++;
}else if(total[t]>=85.50&&total[t]<=88.49&&o<=hee){
   System.out.println("2.00\n");
   period[t]=2.00;
   t++;
}else if(total[t]>=82.50&&total[t]<=85.49&&o<=hee){
   System.out.print("2.25\n");
   period[t]=2.25;
   t++;
}else if(total[t]>=79.50&&total[t]<=82.49&&o<=hee){
   System.out.println("2.50\n");
   period[t]=2.50;
   t++;
}else if(total[t]>=76.50&&total[t]<=79.49&&o<=hee){
   System.out.print("2.75\n");
   period[t]=2.75; 
   t++;
}else if(total[t]>=74.50&&total[t]<=76.49&&o<=hee){
   System.out.println("3.00\n");
   period[t]=3.00;
   t++;
}else if(total[t]>=0.00&&total[t]<=74.49&&o<=hee){
   System.out.println("5.00\n");
   period[t]=5.00;
   t++;
}else{
  System.out.println("stp");
}
            pe[q]=ent[q]*period[q];                
            Ko+=pe[q];
            q++;

}else{
    
 }
      }else if(hon==1){
          hon++;
          kon=true;
             
             

}else if(kon){
     truet=false;
     Ko/=Do;
     System.out.print("YOUR GWA IS: ");
     kon=false;
     qwa=true;
     if(Ko==5.00){
      System.out.println("DRP");
     }else{
      System.out.printf("%.2f", Ko);    
     }                     
    }else{
    j=0; 
    if(loc){
    h++;
    loc=false;
    }else{     
    }
    truet=true;   
    kon=true;
             if(qwa){              
              boolean repeat=true;          
  do{ 
      System.out.print("\nDo you want to back? y/n: ");
      String selection=sc.next();
      if(selection.equalsIgnoreCase("y")||selection.equals("123")){
          loc=true;
          h=hee;
          rt=3;         
          m--;
          pot=3;
          hon=1;
          lop=4*hee-1;
          zen=true;
          t=hee-1;
          j=hee*4-1;
          kon=false;              
          total[t]-=conv[j][j];      
          o--;
          pen=true;   
          q--;
          Ko*=Do;
          Ko-=pe[q];
          repeat=false;
          qwa=false;
      }else if(selection.equalsIgnoreCase("n")){
          boolean tr=true;
          do{             
           System.out.print("\nCredits y/n: ");
    String ch = sc.next();
      if(ch.equalsIgnoreCase("y")){
       System.out.println("\nCreated by:\n\n"+crd[4]+crd[1]+crd[7]+crd[2]
               +" "+crd[6]+crd[0]+crd[3]+crd[5]+"\nSTI College Dagupan ");
       tr=false;
       repeat=false;
       
      }else if(ch.equalsIgnoreCase("n")){
         repeat=false;
         tr=false;
          break;
      }else{
      }
      }while(tr);
      }else{
      }
             }while(repeat);
             }else{
                 
             }
            }
    } while(h<=hek1);
   } else{   
  }
   pot++;
  }while(truet&&opk==1&&pot<=lop);
    kop++;
    opk++;
  if(kop==0){
    pot=0;
    opk=0;
  }else{
   continue;
  }
  } while(kop<=fon);
      }
}
       
       

