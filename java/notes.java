/*#if for e while sono completi
#progblema non risolvibile_ capire se dati due insiemi di 
#stringhe programmare in modo orientato agli oggetti significa rappresentare un insieme di dati tramite una particolare struttura dati
#appunto oggetti, un oggetto è composto da caratteristiche dette attributi e metodi
#il signidicato di n! è l'insieme di permutazioni di n elementi
#


'''
java linguaggio di programmazione mantenuto dalla Oracle (ha grandi database) all'interno del file exe ci sono stringhe in linguaggio macchina
le applicazioni create in java sono invece col suffisso JAR, infatti l'app non viene eseguito direttamente dalla macchina ma viene eseguito da un'altra
app: JRE (java runtime environment) ====> viene interpretato ma non compilato (il JRE traduce infatti simultaneamente) 

CODICEJAVA (compilatore java --> JRE) ===> APP JAVA ===> JRE ===> CPU  ------> java per l'interpretazione non è prestante.
ora però il jre è ottimizzato per cui traduce a blocchi non più rigo per rigo
JDK = Java developement kit

per scrivere linguaggi java si usa il suffisso .java -------> quando viene compilata in app java si usa un compilatore che traduce l'app col suffisso .class

WORA ====> Write Once Run Anywhere

Mioprog.java ---> public (quello che sto scrivendo è visibile a tutti) --> public class Mioprog{ }--->nome uguale al file


import IO.*;
public class Mioprog{

----> qui va definito tutto il codice, fatto da metodi (funzioni) e il main ===> 
public static void main(String[] Args)===> argomenti della funzione {
    int n = 6;/* oppure si dichiara all'inizio per essere usata dopo int n 
    int z = IO.readInt("Dammi un intero"); /*lol gg ez*/
  /*  IO.println("Hello World");
    system.out.println("Hello World");
                                                                        }
}

Java è un linguaggio che necessita della dichiarazione del tipo di vatiabile prima della variabile. I tipi di variabili sono:

boolean   (1 bit)
byte------------------>  intero (1 byte) --> 8bit[-128, +128]
short----------------->  intero (2 byte) --> 16bit
int------------------->  intero (4 byte) 
long------------------>  intero (8 byte)

float----------------->  numero a virgola mobile (4 byte)
double---------------->  numero a virgola mobile (8 byte)

char------------------> (2 byte) 

/* esempio di sintassi*/
/*
if(n>m){
    IO.print(".....");
    IO.println("gg");


}

else
{

}


GG EZ FF  AATROX COUNTER MAIN
 */


import IO.*;
public class notes {

public static void main(String args[]){
    System.out.println("Hello World");
    int m = IO.readInt("give me an integer m");
    int n = IO.readInt("give me an integer n");
    
    if (m>n)
    {
        System.out.print("m");
        System.out.print(" è maggiore di ");
        System.out.print(n);
        //le parentesi graffe possono essere evitate se all'interno
        //dell'if è presente solo un'istruzione
        //oppure System.out.println(m+" è maggiore di "+n);
        //se l'operatore + ha come argomento almeno una stringa allora
        //viene interpretato come concatenazione altrimenti come somma 
        //(se l'argomento ha due numeri dello stesso tipo)
    }
    else
        if (m<n)
                System.out.println("il secondo numero è maggiore del primo");
        else
            System.out.println("i due numeri sono uguali");
}

}
/*commento su più di una riga

Altro esempio 

public class MyFirstClass{

    public static void main(String[] args){
        
        double m = 10.5;
        double n = IO.readDouble("dammi un numero decimale");

        if (m!= n)
                IO.print("I due numeri sono diversi");
        else
                IO.print("I due numeri sono uguali");


    }



}

esistono due tipi di errori: quello di runtime(che avviene durante 
l'esecuzione del programma)
e quelli di compilazione (al momento della compilazione)

il double prende tutti e 64 i bit, e prova anche con il 32, per cui dà errore
se si dichiara formalmente con il double

es float m=10.5 ==> errore
es float m = 10.5f ====> giusto (interpreta e codifica il numero a 32 bit e
assegnalo alla variabile float m)   

Da' errore perchè di default java compila i numeri a virgola mobile come double

processi di java:
float m = 10;
^
tipo della variabile

float m = 10;
           ^
          codifica del numero(in questo caso errata)

java utilizza questo tipo di sintassi per il range limitato di valori
rappresentabili da float rispetto a double

float n= 10.0f

int m = n =====> questa sintassi è errata perchè:
nell'int i numeri rappresentabili sono di diverso tipo (tutti dopo la virgola)
mentre nel float i numeri rappresentabili sono in parte delle cifre intere e in parte
dei numeri dopo la virgola
^
per bypassare questo 

es.
double d = 1533345143.423432d
float f2 = (float) d; //CASTING

se si prova ad assegnare ad una variabile float un numero con più cifre di quelle
che può rappresentare dopo la virgola l'assegnazione sarà con il numero float più vicino
esempio:

float m = 2099011455;

IO.print(m); ==> output 2.09901146E9

esempio media

import IO.*;

public class MyFirstClass{
    public static void main(String[] args){
        int m = IO.readInt("Dammi un intero m: ");
        int n = IO.readInt("Dammi un intero n: ");

        int somma= m+n;
        float media = somma/2.0f; //oppure float media =((float)somma)/2;
                                                        // ^
                                                       //di questo non va fatto
                                                      //float (somma/2) ==> perchè approssimerebbe ad un intero   
        IO.println("Somma= "+somma+ "; Media = " + media);
    }
}

for in java:

esempio

import IO.*;

public class MyFirstClass {
    public static void main(Strng[] args){
        
        int m = IO.readInt("Dammi un numero:");
        IO.println("Adesso leggerò da tastiera "+m+"numeri");

        int somma= 0

        for (int i = 0; i<10; i++){
            int n = IO.readint("numero in posizione "+i+": ");
            somma = somma+n;
            IO.println(i+ ") Ciao");
        }

        IO.println("la somma è :" +somma);
    }
}

//arricchire questo programma con la media di ogni numero e scrivere un programma
//per i fattoriali 

//tips esercitazione

la scrittura:
sum = sum+ 1

è equivalente a:
sum += 1


se si dichiara una variabile come argomento del for la variaile esiste solo all'interno del ciclo
se si prova a dichiarare la funzione all'esterno del ciclo il programma ritorna errore (si dice che la variabile all'interno del
for ha un ciclo di vita limitato al corpo del for)

nelle situazioni in cui non si conosce il numero di elementi in input si può usare un contatore 
esterno (una variabile esterna intera)

variabile booleana ----> boolean flag = true;



ESEMPIO

import IO.*;

public class mioprog{

    public static void main(String[] args){

        IO.println("Scrivi una sequenza di numeri terminata da un intero negativo");
        int somma = 0, cnt = 0;
        boolean flag = true
        for(int i=0; flag == true; i++){
            int n= IO.readInt("numero in posizione ("+i);
            if (n>=0)
                somma+=n
                cnt++ //oppure
            else
                flag = false;
                cnt = i; //alternativa
        }
        media = (float) somma/cnt;

        IO.println("la media di " + cnt +" è "+ media)
    }

}

si può dichiarare esternamente la variabile intera in modo tale da avere una sola variabile come contatore

esempio

int i=0
for(; flag == true; i++){}
    ^
    ha già la variabile all'esterno del for 

la variabile i viene incrementata prima dell'inizio delle iterazioni all'interno del for

una scrittura del tipo

IO.println("ho letto "+ n-1 + " numeri non negativi")

è SBAGLIATA perchè il programma cercherà (in questo caso) di fare la sottrazione tra un intero e una stringa, per
evitare questo tipo di problemi si mette una parentesi per unire i numeri in uno solo

IO.println("ho letto "+ (n-1) + " numeri non negativi")

quando un numero sfora i possibili numeri rappresentabili di una variabile dichiarata il numero viene letto come stringa e viene dato un numero
semanticamente sbagliato

es
int j = 20000000000

int z = 20000000000

se si calcola la media di questi numeri al posto del numero stesso uscirà un numero del tipo
-1.47482648E8
ovviamente sbagliato

una possibile ottimizzazione in un programma sulla media aritmetica è dividere ogni numero all'interno del ciclo (possibile ovviamente solo se
già si sa la quantità di numeri su cui calcolare la media)

while in java

esempio con operazione fattoriale:

    while(i<=m)
    {
        fattoriale*=i;
        i++;
    }


esempio contatore numeri positivi o negativi

IO.println("inserisci una sequenza di interi terminata da 0")
boolean flag = true;
int cntPositivi =0, cntNegativi = 0;

while(flag)
{
    int n = IO.readInt("dammi un nuovo numero: ");
    if (n>0)
        cntPositivi++;
    else
        if(n<0)
            cntNegativi++;
        else
            flag=false;
}


per forzare l'uscita da un ciclo si usa break;

//fare un programma che legge una sequenza crescente di numeri interi. La sequenza si considera terminata quando il numero appena letto
non è maggiore del precedente. restituire il numero massimo dei numeri in posizione dispari.
fare due varianti usando for e while.
import  IO.*;
public class IntSeq{
    public static void main(string[] args){
        int prova = IO.readInt("inserire oggetto numero: 0");
        boolean flag = true;
        int max_dispari=prova;
        for(int i = 1; flag; i++){
            int c=IO.readInt("inserire oggetto numero: "+i);
            if(c<prova){
                flag=false;
            }
            else{
                if(i%2!=0){
                    max_dispari = c; 
                }
            }
        }
    }
}


come si dichiara un array? 

int n[]
 oppure
int[] n

gli array sono di una lunghezza definita a priori con la dichiarazione dell'array,
per leggere ogni elemento di un array si usa un ciclo for con l'array appena creato con il vettore lunghezza

esempio:


int[] v = {5,6,8};

for(int i= 0; v.lenght; i++){
    v[i] = IO.readint("dammi il numero in posizione "+i)
}

un array può anche essere creato dinamicamente (può essere anche fatto scegliere all'utente dinamicamente assegnando una variabile alla lunghezza
dell'array)

esempio:

n= IO.readint("dammi la lunghezza dell'intero")
int [] v1 = new int[n]

        GESTIONE DELLA MEMORIA


        _____________STACK_______________________
        

        n[4] ------------------------------->int n = 4

        
        f[3,22]----------------------------->float f = IO.readInt("...")
        
        
        m[12]------------------------------->int m = 3*n
                                                                                             
                                                                                         ______HEAP_______
        v [0x11111] -------------------------------------------------------------------->{  [] v[0]        --->(celle statiche determinate dal tipo di array che si crea)
            ^                                                                               [] v[1]
                                                                                            [] v[2]
                                                                                            [] v[3]
            puntatori di memoria
                                                                                            .
                                                                                            .
                                                                                            .
        __________________________________________                                          
                                                                                            [] v[n]        --->(numero di elementi dinamico perchè crea prima il tipo di cella dell'array
                                                                                             }                  prima di sapere gli elementi al suo interno
                                                                                                                esempio:
                                                                                                                int [] n = new int[IO.readInt] -----> sconosciuta la dimensione fino al momento della
                                                                                                                                                       sua allocazione)
                                                                                         _________________           




do{}while(n<=0) è un'istruzione che, a differenza del while, viene eseguita almeno una volta
prima della verifica. I modi di risoluzione son gli stessi del while, però a volte è più utile
utilizzare il do{}while per alcuni tipi di algoritmi risolutivi. 

glossario: && = and; ||= or

quando si prova a stampare un vettore, il programma non restituisce
l'insieme di elementi all'interno di vettori ma l'indirizzi dell'area
di memoria che punta alle celle nelle quali son memorizzate le variabili esempio:

[F@7ba4f24f 

[= variabile che punta ad un array
F = array di float
@ = separatore 
7ba4f24f = stringa che identifica unicamente l'array rispetto a tutti gli altri oggetti o array creati sul momento

FUNZIONI IN JAVA
sintassi delle funzioni in java:
restituzione(specificata a priori)        nella funzione non va specificata la dimensione dell'array ma deve essere identica
                 ^                         ^
public static float[] creaVettoreMedie(float[] f1, float[] f2){

    float[] v1 = new float[f1.lenght];
    for(int i=0; i<f3.lenght; i++){
        f3[i]=(f1[i]+f2[f2.lenght-1-i])/2;
    }
    return f3;

}

nella funzione si scrive void (vuoto) se la funzione non restituisce nulla
public static void main(String[] Args)
{
    float v1........................
    float v2.......................

    float v3 = creaVettoreMedie(v1, v2);
    
}
 


esempio di programma e traccia di esecuzione con record di attivazione:

public class MyFirstClass{

    public static float[] creaVettoreMedie(float[] f1, float[] f2)
    {
        float[] f3= new float[f1.lenght];
        for(int i=0; i<f3.lenght; i++)
            {f3[i]=(f1[i]+f2[v2.lenght-1-i])/2;}
        
        return f3
    }

    public static void main(String[] args){
        int n;

        do{
            n=IO.readInt("dammi un numero positivo pari n:")
        }while(n<=0 || n%2 != 0);

        float[] v1=new float[n/2];
        float[] v2=new float[n/2];  

        IO.println("adesso introduci "+n+" numeri decimali");
        for(int i=0;i<n;i++){
            if(i%2==0)
                v1[i/2]=IO.readFloat("numero in posizione "+i+": ");
            else
                v2[i/2]=IO.readFloat("Numero in posizione "+i+": ");

        }

        float[] v3=new float[v1.lenght];
        for(int i=0;i<v3;i++)
            v3[i]=(v1[i]+v2[v2.lenght-1-i])/2;

        float[] v3= creaVettoreMedie(v1,v2);
        
        IO.println("contenuto dell'array:");

        IO.println("[ ");
        for(int i=0;i<v3.lenght,i++){
            IO.print(v3[i]+" ");
        }

       
    }
}


java divide la memoria in 2 parti:

lo stack e l'heap



esistono particolari strutture dati in java: le stringhe

le stringhe possono essere viste come una sequenza di caratteri, a volte definita impropriamente array di caratteri.
Se si prova a stampare una stringa su terminale:

String s = "Ciao"

IO.println(s)

il risultato non sarà lo stesso della stampa di un array, ma a schermo verrà mostrata la stringa stessa.
La stringa punta automaticamente ad una sequenza di caratteri del sistema di codificazione proprio di java.

es.

stack                        heap

s[0x11001] ---------------->['C']
                            ['I']
                            ['A']
                            ['O']

Le stringhe non sono esattamente array di caratteri ma oggetti modificati per essere più 'USER_FRIENDLY'
un esempio è il comando della stampa su terminale, che 'bypassa' la scrittura del puntatore arrivando direttamente al contenuto.

Per l'elenco di tutte le funzioni delle stringhe si può vedere su google la documentazione ufficiale.

Un esempio per il Metodo delle stringhe è charAt che stampa solo un carattere appartenente alla stringa
esempio:

for(int i=0; i<s.lenght;i++){
    IO.println(s.charAt(i));
}

Metodo compare
Il Metodo compare è un'altro metodo appartenente all'oggetto stringa, in particolare

il Metodo Compare vede la lunghezza delle stringhe (lessicograficamente), e restituisce un numero negativo se la
stringa argomento della funzione è maggiore di quella presa come attributo e in particolare il numero negativo è uguale al numero
di caratteri maggiori nella seconda stringa. In caso di lunghezza identica fra stringhe compare restituisce 0.

#SBAGLIATO RIFARE


sintassi



quando si va a comparare le due stringhe (es. s==s1) allora l'operatore andrà a verificare l'uguaglianza tra gli indirizzi delle stringhe e non 
del contenuto delle stringhe. Java ha però un'ottimizzatore che decide di dare lo stesso indirizzo alle stringhe di uguale contenuto, che decide
a priori prima dell'esecuzione del programma. Infatti due stringhe verranno assegnate precisamente all'interno del codice saranno classificati
come uguali, invece non sarà così per le variabili che verranno assegnate durante l'esecuzione del programma.
Con la concatenazione accade una differenziazione delle aree di memoria, che di conseguenza non farà comparare propriamente le due stringhe.
Dato che la cella di due stringhe uguali (scelte a priori) sarà la stessa allora una modifica ad una delle due sarà la stessa sull'altra stringa
assegnata con lo stesso contenuto.
Con gli array non accade questo tipo di assegnazione (non sono oggetti).

L'UNICO MODO PER UNA COMPARAZIONE SICURA E' USARE LA FUNZIONE EQUALS.

se si cerca di cambiare una stringa assegnata ad un'altra stringa se si cerca di camniare la stringa ad esempio:

String s= "abc";
String sCopia = s;

s+= d-------> in questo caso verrà creata una nuova varibile.

Metodo replace:

il metodo replace RESTITUISCE una stringa prendendo come argomenti la lettera da sostituire e quella sostituente:

s.replace('a', 'Z');

RESTITUISCE un'altra stringa, e non modifica la stringa s

Celle nei vettori:

int[] a = {8,3,5};
int[] a1 = a;
int a1[0] = 80;
IO.println(a[0]);

*Garbage collection*
String s = 'abc';
String g = s+'def'
in questo caso a g assegnerà un nuovo indirizzo che punterà ad un'altra cella di memoria che ha il contenuto di s + def
vedere come forzare la garbage collection
esercizi:

quando si prova a modificare una stringa(ad esempio concatenandola)
non si modifica la stringa stessa ma in realtà viene creata una nuova stringa
in una nuova cella di memoria

Un vettore(ad esempio di strnghe) deve essere inizializzato SEMPRE.
esempio:
String[] vettoreDiStringhe; ------> in questo caso darà errore perchè la stringa noon contiene nè la lunghezza nè valori: Per risolverlo bisogna usare il 'puntatore fake' null (String[] vettoreStringhe= null;)
int m = IO.readInt("quante stringhe vuoi inserire?");
if(m>0){
    vettoreDiStringhe = new String[m]
}

per risolvere problemi dovuti a operazione di un'ipotetica funzione che prende come argomento una stringa null
si può utilizzare un if(String != null) oppure un ciclo con la rispettiva condizione for(int i=0; vettS != null && i<vettS.length/2; i++)

il metodo cortoCircuito

in una condizione del tipo:

(A || B) se è vera la condizione A, la condizione B non viene analizzata

invece nella condizione:

(A && B) questo accade al contrario, infatti se la condizione A è falsa la condizione B non sarà verificata

Le classi:

esempio di sintassi:

    public class mycompany {
    public String nome = "Microsoft corp.";
    public String fatturato = "168 MLD";
    public String CEO = "Satya Nadella";
    public String mvservice= "Windows";

    //  costruttore
    //   ^
    public mycompany(String nome, String fatturato, String CEO, String mvservice){
        this.nome = nome;
        this.fatturato = fatturato;
        this.CEO = CEO;
        this.mvservice = mvservice;
    }
}




    STRUTTURA DELLE CLASSI

    quando si crea una classe e viene stampato l'oggetto, il codice mostrerà a schermo l'indirizzo (nello stack) degli attributi nell'heap 
    (similmente agli Array).Esempio:
    


    
il metodo toString() serve per convertire le stringhe di stampa, in modo tale da far si che quando si prova a stampare l'oggetto si abbia non 
più l'indirizzo ma gli attributi veri e propri dell'oggetto, trasformati da una sorta di "casting" non esplicito.
esempio:
public String toString(){
    return "nome: "+this.nome+" Età: "+this.eta;
}

Metodi GETTERS e SETTERS (convenzionali)

public String getNome(){
    return this.nome
}

public void setEta(int eta){
    this.eta = eta
}

public void incEta(){
    this.eta++;
}

public class 21-03-2022 {
   

    public String nome;
    public int eta;

    public Persona(){ //se non specifico alcun argomento intendo il costruttore standard, senza indicare alcun parametro 
       this.nome="";
       this.eta= 0
    }
    //un'altro costruttore che si costruisce è:
    public Persona(String nome, int eta){
        this.nome=nome;
        this.eta=eta;
    }
}




// Persona p= new Persona(); 
//Persona p2 = new Persona();
// Persona p3= new Persona(IO.readint("Nome della persona"), IO.readInt("Eta della persona"));



IO.println("Persona n#1");
IO.println("Nome: "+ p1.nome+ "Eta: "+ p1.eta);
IO.println(p1); //stampa un indirizzo che punti dallo stack, per poter stampare dello poter puntare nell'heap. Quando non sono 
//tipi di base, tutti gli altri sono tipi dinamici perciò non puntano a una variabile direttamente .

int[] a = new int[3];
float f = 12.5f;
Persona p = new Persona("X", 18);
String s="Ada"

STACK                                           Heap
******************

a[ax1223934129]----------------------> []0, []1, []ecc

f[13.5]//rimane così nello stack
p[ex1312312q]-------------------------> Nome[ex2381221]---------> ["X"]
                                       eta[13]


s[ex132312321]------------------------> "A", "d", "a"






public String toString(){ //serve per convertire a stringa la stampa, ora posso stampare p1, direttamente.
   return "nome: "+ this.nome + "eta:" + this.eta; 
}

//usando
IO.println(p1);

//la stessa cosa può essere usata con le stringhe.


//metodi getter e setter
//dato un oggetto corrente restituiscono un valore e setter lo modifica

public String getNome{
   return this.nome;
}

public int getEta{
   return this.eta;
}
public void setEta(int eta){
   this.eta=eta;
}

//nel main ora posso scrivere:
if(p1.getNome().equals("")){
   p1.setEta(30); 
}


//posso usare private per far si che nessuno può accedere a quel campo con la notazione (.), si possono usare solo getter e setter per fare tutto, anche modificare


public void incEta(){ //per modificare l'età e incrementare
   this.eta++;

}

p1.setNome(IO.readString("Nome della persona:" ));
p1.setEta(IO.readInt("Inserisci nome: "));

public void leggiDaInput(){
   this.nome = IO.readInt("Dammi il nome della persona");
   this.eta= IO.readInt("Dammi l'età della persona");
}


//ora invece di 97 e 98 posso usare:
p1.leggiDaInput();
//e poi
IO.println(p1);

//Non posso fare p1==p2 ( vengono paragonati gli indirizzi) . devo fare: 


//COMPARAZIONE TRA 2 OGGETTI
public boolean equals(Object obj) {
   if (this == obj) //-----> viene comparato l'oggetto che viene richiamato con l'oggetto passato come parametro
       return true;
   if (obj == null) //-----> si vede se l'oggetto ha un indirizzo null
       return false;
   if (getClass() != obj.getClass()) //-----> si verifica che l'oggetto richiamato sia uguale all'oggetto passato come parametro
       return false;
   Persona other = (Persona) obj; //------> casting object per la verifica degli attributi dell'oggetto
   if(this.eta!=other.eta) //-------> verifica di ogni parametro dell'oggetto
       return false;
   if(this.nome!=null)
       return this.nome.equals(other.nome);
   return other.nome==null;
   
}

esercizio creare un array di tre persone e leggere da
input gli attributi della persona e paragonare una
quarta persona alle altre 3 


se si prova a stampare un oggetto vuoto(non dichiarato)
con il metodo toString(), il metodo restituirà null 
(valore di default di un oggetto) 
per i numeri il valore di default è 0 (con gli array).

La stessa cosa avviene quando il costruttore non è definito

quando si crea un oggetto senza instanziarlo quell'oggetto
è semplicemente indefinito (non è nemmeno null)

quando si prova a stampare (con il metodo toString() inizializzato)
un oggetto non instanziato quest'ultimo non sarà definito e 
quindi verrà restituito errore.

se si crea un array di oggetti invece a ogni elemento dell'array
verrà messo null come parametro predefinito e quindi 
si potrà procedere comunque con la stampa.

esempio:
Persona[] arrayP = new Persona[3];

for(int i=0; i< arrayP.lenght; i++){
    IO.println(arrayP[i]);
}

Quando viene dichiarato un array di oggetti senza instanziarlo
ad esempio:
Persona[] arrayP = new Persona[3];

se si prova a eseguire questa funzione:

public void leggidaInput(){
    this.nome = IO.readString("NOME: ");
    this.eta = IO.readString("ETA': ");
}

in questo modo:

for(int i=0; i<arrayP.lenght;i++){
    arrayP[i].leggiDaInput();
}

verrà dato errore perchè l'array risulta essere formato
da soli null.

Quando si chiama il metodo, infatti, quell'oggetto non può essere
null perchè se è null significa che non punta ad un'area dell'heap
in cui è materializzato un oggetto.

Per puntare quindi ad un'area dell'heap bisogna passare ad ogni elemento
dell'array il costruttore senza parametri.
es.:

for(int i=0; i<arrayP.lenght;i++){
    arrayP[i]= new Persona()
    arrayP[i].leggiDaInput();
}

Cosa avviene durante il ciclo (i=0):

STACK       |     HEAP
_______________________
            |                  Quando viene l'elemento in arrayP viene inizializzato con Persona()
arrayP      |                   ^
[0x1111]--->| [Null 0x111000]0 -----> {[nome | null]
            | [Null  ....]1            [ eta | 1]}  
            | [Null  ....]2
            |
            |
            |
            |
            |
            |


***********riepilogo**************
Istanza
un'istanza della classe è un oggetto effettivamente creato
della classe, ad esempio, la classe Cane può avere la razza il
nome e la capacità di abbaiare. Questi attributi sono astratti, ma 
quando diventano definiti (ad esempio il cane Tommi è un pastore 
tedesco e ha la possibilità di abbaiare) si dice che viene instanziato
un nuovo oggetto.

Static 
la keyword (parola chiave) static, usata nei metodi, indica
che quei metodi si riferiscono all'intera classe piuttostoù
che all'istanza di una classe. In altre parole: la parola chiave static è usata
per descrivere metodi che esistono indipendentemente da ogni istanza creata
della classe. Static inoltre può accedere solo ai dati statici, che vengono memorizzati
direttamente nell'heap e non in un altro oggetto.

Private
private è una keyword (opposta a public) che non permette al programmatore
di richiamare un attributo, un metodo o una variabile privato se non all'interno di funzioni definite da
metodi (ad es. Setters) oppure nella classe stessa. Quello che fa la keyword
è infatti nascondere ad altre classi l'attributo, il metodo, o la variabile.
Es:
public class Persona{
    private String nome="ciccio";
    private int eta=50;

}

.....main.....{
    Persona p1 = new Persona();
    p1.nome = "razuzi" //----> error
}


un metodo si dice dinamico se prende come argomento implicito un oggetto della classe associata e usano riferimenti come "this" per
usare l'oggetto implicitamente richiamato all'interno del metodo.



***********************************************DOMANDA ESAMEEEE************************************************************

DOMANDA ESAME
DOMANDA ESAME

supponiao di creare una classe Persona() e leggerla da input tramite la libreria IO

quindi:

Persona p = new Persona(IO.readString("NOME"), IO.readInt("ETA':"));
Persona q; //contiene un valore indefinito

la domanda è

Persona q=p; //Cosa succede in questo caso?????

se eseguiamo la stampa di p e q l'output prodotto sarà ad esempio del tipo:

Persona p ----> NOME: A ETA': 1
Persona q ----> NOME: A ETA': 1

se proviamo a cambiare l'età della persona q ad esempio (q.setEta(100)) e se proviamo a stampare di nuovo
i campi nome ed eta degli oggetti il risultato sarà:

Persona p ----> NOME: A ETA': 100
Persona q ----> NOME: A ETA': 100

questo perchè abbiamo copiato nella persona q SOLO L'INDIRIZZO dell'oggetto persona p

questo assegnamento si chiama aliasing ----> viene dal latino Alias (altro nome per cui conosciamo qualcuno)
è improprio dire che si tratta di una copia, perchè la copia avviene SOLO PER GLI INDIRIZZI.

Questo però non accade con variabili PRIMITIVE:
ad es.
int a =10;
int b= a;

in questo caso se si prova a modificare solo a ad esempio la modifica avverrà solo su a

PERCHE' QUESTO

STACK                            HEAP
_______________________________________
P[0x11001001]--->    |-->{ nome[0x1100010]  ------->['c','i','a','o']
                     |      eta[1]}
                ^    |
                |    |
Q[0x11001001] __|    |
                     |
                     |
q[10]//valori        |
    //effettivi      |
a[100]               |



questo avviene per TUTTI gli oggetti:
TUTTI GLI OGGETTI SE ASSEGNATI AD UN ALTRO OGGETTO NON FANNO LA COPIA PROFONDA MA SOLO LA COPIA DELL'INDIRIZZO

All'opposto dell'aliasing c'è la copia profonda:
copia profonda ---> copia che restituisce un oggewtto che all'interno contiene copie dei campi nell'oggetto originale che garantisce il totale
                    disaccoppiamento fra essi

La domanda sorge quindi spontanea:
come si può geerare una copia profonda?

soluzione 1:
si crea una funzione in cui si definisce la copia

soluzione 2:
si crea un nuovo costruttore in cui viene preso come argomento un oggetto persona.
Esempio:

public Persona(Persona p){
    this.nome = p.nome; //da rivedere (questa è un aliasing di stringhe se si modifica la stringa si modifica anche l'altro nome?) siccome la stringa non ha metodi di questo genere (si sovrascrive la stringa)
    this.eta = p.eta; //le stringhe sono oggetti costanti, non può cioè venir modificato il carattere i-esimo con un'altro carattere (a differenza degli elementi degli array) in java
}

se si prova a creare un campo con un array
ad es.

this.numeriFortunati = {1,2,3}; //questa riga darà errori perchè per java non è una vera inizializzazione (l'array ha un valore 'null')

per evitare errori basterà inizializzare l'array numeriFortunati in questo modo:

this.numeriFortunati = new int[3];

//per gli array è come per le stringhe (si copia l'indirizzo) ----> approfondire

copia shallow---> copia superficiale

Ogni attributo può essere un qualunque tipo di dato, anche un dato della classe stessa

ad esempio, possiamo definire all'interno della classe persona anche una relazione con un'altra persona della classe stessa

dato ricorsivo: dato tale che una delle caratteristiche è data da un dato dello stesso tipo, ad esempio nella classe persona:
//costruttore
public Persona(String nome, int eta, Persona amica){
    super();  //---> il nome super definisce una gerarchia di oggetti
    this.nome=nome;
    this.eta=eta;
    this.amica=amica;
}

e nel costruttore senza parametri:

public Persona(){
    this.nome="";
    this.eta=0;
    this.amica=null; //questo avviene perchè nel dato ricorsivo si copia l'indirizzo dell'oggetto e non l'oggetto stesso 
    //(se si modifica quindi viene modificato l'oggetto anche all'interno della classe)
}

public static void main(String[] args){
    Persona p1=new Persona();
    p1.leggiDaInput();
    Persona p2 = new Persona("Francesco",22,p1);
    IO.println("persona #1");
    IO.println(p1);
    IO.println("persona #2");
    IO.println(p2); //esatto semanticamente ma va perfezionato il metodo ToString altrimenti potrebbe dare problemi nel runtime se la persona è null
}
(null non può essere stampato)

metodo Tostring aggiornato:

public String ToString(){
    if(this.amica != null){
        return ("........")
    }
    return "..........."
}

esercizio: creare una classe rubrica .
Al suo interno, la classe rubrica ha un array di oggetti Persona. quando viene creataun oggetto Rubrica, va indicato il numero massimo di persone
la classe è anche caratterizzata da un numero intero cnt che indica quante celle di arrayPersona sono state utilizzate

La rubrica offre i seguenti metodi:
    boolean insPersona(Persona p): inserisce p nella prima cella vuota. restituisce false se non ci sono celle disponibili
    Persona personaAt(int index): restituisce la persona in posizione index di arrayPersona (viene restituito null se tale persona non c'è)
    boolean rimuoviPersona():rimuove la persona nell cella più a destra e rende la cella disponibile a ospitare una nuova persona

implementare un main dove viene istanziato un oggetto di tipo rubrica e viene utilizzato per ospitare persona via via inserite da input.
Una volta inserite alcune persone, visualizzare il contenuto della rubtrica, provando ad effettuare rimozioni tramite rimuoviPersona()

ALGORITMI RICORSIVI
è un algoritmo che richiama se stesso
ne è un esempio il metodo per il calcolo fattoriale:

//scrittura in maniera semplice:
public static int fattoriale(int n){
    int f=1;
    for(int i=2;i<=n; i++){
        f*=i;
    }
    return f; //!TIPS in matematica non basta definire un numero n€N | n! = n*(n-1)! perchè serve definire anche la "fine" dell'operazione: 1!=1
}

//scrittura in maniera ricorsiva

public static in fattorialeRic(int n){
    if (n ==1)
        return 1;
    return n*fattorialeRic(n-1);
    return f;
}

cosa avviene all'interno di java (record di attivazione):

int fattorialeRicorsivo(int n)

STACK                                                 HEAP
__________________________________________________________
                                         |
int n [6]                                |
                                         |
RecordAtt. di fattorialeRic(6)           |
n=6                                      |
f[720]                                   |
                                         |
            ^ (CANCELLAZIONE MEMORIA)    |
RecordAtt. di fattorialeRic(5)           |
n=5                                      |
f[120]                                   |
                                         |
            ^ (CANCELLAZIONE MEMORIA)    |
RecordAtt. di fattorialeRic(4)           |
n=4                                      |
f[24]                                    |
                                         |
            ^ (CANCELLAZIONE MEMORIA)    |
RecordAtt. di fattorialeRic(3)           |
n=3                                      |
f[6]                                     |
                                         |
            ^ (CANCELLAZIONE MEMORIA)    | 
RecordAtt. di fattorialeRic(2)           |
n=1                                      |
f[2]                                     |
                                         |
            ^ (CANCELLAZIONE MEMORIA)    |
RecordAtt. di fattorialeRic(1)           |
n=1                                      |


un altro esempio è la sequenza di fibonacci:

public static int Fibonacci(int index){
    int i1=0;
    int i2=1;
    if (index==1){
        return 1;
    }
    if (index==2){
        return 2;
    }

    for(int i=3; i<= index; i++){
        int nuovo =i2+i1;
        i1=i2;
        i2=nuovo;
    }
    return i2
}

Sequenza Fibonacci ricorsiva:

public static int fibonacci_R(int index){

    if(index==1){
        return 0;
    }

    if(index == 2){
        return 1;
    }

    return fibonacci_R(index-1)+fibonacci_R(index-2);
}

con le ricorsioni la funzione stessa assume valori a "scaletta ricorsivi"

ogni algoritmo ha bisogno di una gestione delle eccezioni, in particolare per gli algoritmi che riguardano gli array i casi più frequenti che
bisogna gestire:
//un vettore con indirizzo null
//un vettore con un numero di elementi minore rispetto ad un'altro parametro della funzione.
//vettore di lunghezza nulla

public static int[] suffisso(int[] vettore){

    int[] suf = new int[vettore.lenght-2]

    for(int i=0; i<vettore.lenght-2; i++){
        suf[i]=vettore[i];
    }
    return suf;
}

public static int max(int[] vettore){

    if(vettore.lenght == 1){
        return vettore[0]
    }

    int[] suf = suffisso(vettore)
    int maxSuf = max(suf);

    if(maxSuf>vettore[vettore.lenght-1])
        return maxSuf;
    return vettore[vettore.lenght-1];
}

**********costrutto di java generics**********

-questo construtto serve principalmente a ritornare oggetti multipli all'interno di un metodo

esempio: creiamo una nuova classe e la chiameremo CoppiaStringhe:

public class coppiaStringhe{
    
    private String s1;
    private String s2;

    public coppiaStringhe(String s1, string s2){
        this.s1 = s1;
        this.s2 = s2;

    }


    public static CoppiaStringhe estremi(String[] arrayS){
        
        //controlli per sicurezza codice (arrayS != null)
        
        CoppiaStringhe res= new CoppiaStringhe(arrayS[0], arrayS[arrayS.lenght-1]);
        return res;
    }



}



altro esempio: coppiaPersona

public class CoppiaPersone{
    private Persona1;
    private Persona2;

    public CoppiaPersona(Persona persona1, Persona persona2){ //si può fare la stessa cosa di coppiaStringhe
        this.persona1 = persona1;
        this.persona2 = persona2; /////copia shallow
    }


}

siccome queste classi bisognerebbe ogni volta riscriverle per ogni oggetto, java dà la possibilità di scrivere quest'ultime in forma
parametrica.

esempio:

public class Coppia<T>{ //T è il tipo generico
    private T element1;
    private T element2; // quando si deve instanziare l'oggetto all'interno del costruttore Coppia si dovrà specificare il tipo di oggetto
                            //                                                          vvvvvvvvv
    public Coppia(T element1, T element2){
        this.element1 = element1;
        this.element2 = element2;

    }


}


si possono scrivere funzioni multiple all'interno della classe dichiarata generica, ma se si devono scrivere funzioni generiche all'interno
di una classe bisogna usare una sintassi leggermente diversa:


//               v (all'interno della classe dichiarata generica)
public static Coppia<T> EstremiGenerico(T[] array){

    if(array==null || array.length==0){
        return null;
    }

    Coppia<T> res = new Coppia<>(array[0], array[array.length-1]);
    return res;
}



//               v (all'interno di un'altra classe, es: Main)
public static <T> Coppia<T> EstremiGenerico(T[] array){

    if(array==null || array.length==0){
        return null;
    }

    Coppia<T> res = new Coppia<>(array[0], array[array.length-1]);
    return res;
}


se si crea all'esterno della classe generica, il risultato coppia dovrà essere dichiarato nel modo:

Coppia <T, S> res= new Coppia<>(.....)

#tips !important 1 il file della classe generica dev'essere omonimo senza considerare le parentesi angolari
#tips !important 2 se una classe è stata definita generica a priori non c'è bisogno di specificare in un metodo nuovamente
                   il parametro con le parentesi angolari

Quando viene invocata una funzione generica, invece, va specificato il tipo di oggetto con cui la funzione dovrà lavorare
in questo modo:
//        v
Coppia<String> csGEN = estremiGENERICO(as);

oppure:

Coppia<String> miaCoppia = new Coppia<>("stringa1, stringa2");

Coppia<Persona> cp= new Coppia<>(new Persona(), new Persona());


NON si può usare però questo metodo con variabili primitive, ad esempio interi int

Coppia<int> cp= new Coppia<>(1, 2);

questa sintassi darà ERRORE (uno dei motivi a livello di sintassi è che il nome int ha la lettera minuscola).
Per creare, ad esempio, una coppia interi, sarà necessario usare le WRAPPER CLASSES ----> un tipo classe corrispondente per ogni variabile di base.
Queste classi simulano un intero come un oggetto, un float come un oggetto etc...
esempio:

Integer n1=5;

Integer avrà al suo interno un puntatore di memoria che punterà ad un'area contenente un intero.
La scrittura:

Integer n2= n1+4

fa prendere a java l'indirizzo di n1, fa sommare l'intero di n1 al numero 4, e crea una nuova cella di memoria nella quale assegnà il risultato,ù
che verrà assegnato a n2.

OVVIAMENTE gli integer si possono sommare con l'operatore +, le classi custom tendenzialmente no. Per essere più precisi: le wrapper class e le Stringhe
permettono gli operatori, altre classi generiche no. Per gli Integer vale però l'operatore == come comparazione degli indirizzi (equivalentemente ad altre
classi cusstom). Per gli Integer vale la stessa ottimizzazione delle stringhe: possono venir assegnati (se numeri piccoli) alla stessa area di memoria.

LE LISTE FINALMENTE SONO FELICE ESISTONO ANCHE IN JAVA

STACK                                                                           HEAP
______________________________________________________________________________________
                                            
                                                            v Cellette di memoria prefissate (ce ne sono un numero prestabilito, ad es. 10)
ArrayList    --------------------------------------------->[[], [], [], ........]
[0x110011]                                                           |
                                                                     |
Al.add("Stringa1");                                                  |
:                                                                    |
:                                                                    |
:                                                                    |
Al.add("StringaN");                                                  |
                                                                     |
Al.add(Stringa11);                                                   |
^quando viene superata la cella di memoria,                          |
 l'array viene reinstanziato in una nuova area con                   |
 più celle e con più memoria                                         |
                                                                     |
                                                                     |
                                                                     v
                                                           [[], [], [], ........]    
                                                           

sintassi:

ArrayList<String> collezioneStringhe= new ArrayList<>(); //in java va dichiarato il tipo di lista

per utilizzare le liste in java occorre importare la libreria già presente nel jdk:

import java.util.*;

le liste hanno molti metodi, tra cui ad esempio la funzione contains(Object o) che restituisce un booleano, in particolare
true se l'oggetto specificato è presente nella lista e false per il contrario. Per vedere se l'oggetto è presente nella lista la libreria usa
.equals().

la lista può essere di una granddezza definita dall'utente:

ArrayList<String> collezioneStringhe= new ArrayList<>(2);

ma non darà comunque errore se si aggiungono alla stessa più oggetti. Le liste riallocano la lista secondo una percentuale non ben definita per ogni jdk.

IO.println(ArrayList); //----------------> le liste presentano un metodo toString() di default.

Le liste funzionano anche con le variabili di base.

Nelle liste c'è un metodo .get(index) che agisce con la restituzione dell'elemento della lista in posizione index. Questo però agisce solo in funzione 
di lettura, per la sovrascrizione di una parte di memoria si devono usare le parentesi quadre con l'indicazione dell'area di memoria da sovrascrivere 
(es: lista[0] = 1;). 

nelle liste si possono aggiungere degli elementi tramite il metodo .add(int index, Object element) 
dove index è la posizione dell'elemento che andrà ad AGGIUNGERE e non a sostituire

esempio: 

ArrayList<String> lista = new ArrayList<>();

lista.add("gg");
lista.add("cc");
lista.add("zz");
lista.add("pp");
lista.add("ff");

la lista sarà [gg, cc, zz, pp, ff]

se eseguiamo il metodo .add() con la posizione 1 ad esempio:

lista.add(1, "hh");

                    v (elemento aggiunto)
la lista sarà [gg, hh, cc, zz, pp, ff]

ha traslato le posizioni degli elementi.
analogamente funzionerà il metodo .remove(int index);


ESERCIZIO

import java.util.ArrayList;
import IO.IO;


public class liste {

    public static ArrayList<Integer> sottoArrayPari(ArrayList<Integer> list){

        if(list ==null || list.size()==0){
            return null;
        }

        ArrayList<Integer> res = new ArrayList<>();

        for(int i=0; i< list.size();i++){ // SI PUò USARE UN FOR ALTERNATIVO PIU' EFFICIENTE PER EVITARE L'IF: for(i=0;i<list.size();i+=2){}
            if(i%2!=0){
                res.add((Integer) list.get(i));
            }
        }

        return res;
        
    }
    

    public static void main(String[] args) {
        
        ArrayList<Integer> lista = new ArrayList<Integer>();

        int sizeList = IO.readInt("number of elements in lista: ");

        for(int i=1;i<=sizeList;i++){
            lista.add((Integer) IO.readInt("element number "+i+": "));
        }

        IO.println(sottoArrayPari(lista));


    }
}


ripasso di remove
esempio:

  0 1 2 3
[ 5 2 7 8 ]

remove(2) ----> 2=index
    |
    |
    v
[ 5 2 8 ]


metodo remove fatto da me per evitare il problema dello shift:

 public static ArrayList<Integer> removeDisp(ArrayList<Integer> lista){

        if(lista == null || lista.size()==0){
            return null;
        }

        for(int i=lista.size()-1;i>=0;i--){
            if(i%2==0){
            lista.remove(i);
            }
        }


        return lista;
    }



    metodo alternativo:

    public static void rimuoviDispari(ArrayList<Integer> l){
        if(l==null || l.size()<2){ //la seconda condizione si può cancellare perchè ridondante
            return null;
        }

        int i=1;

        while(i<l.size()){
            l.remove(i);
            i++
        }
    }

quando si dichiara la dimensione di una lista succede una cosa simile:
     0 1  2 3  4    5    6     7 ------------>capacità-1
l= [ 8 12 7 6 null null null null]
            ^
            |
         size[4]

l.iterator(); ---> oggetto della classe iterator di tipo generics, e si inizializza con la sintassi del tipo:
                    Iterator<Integer> i =list.iterator(); //ovviamente cambia a seconda della lista che punta
                    l'iteratore non è altro che un puntatore subito prima della prima cella di un ArrayList
                    Con il metodo remove() 
l.hasNext(); ----> boolean che dice se esiste un nuovo valore non ancora restituito
l.Next(); -------> restituisce oggetto nella prima posizione non ancora visitata e sposta l'iteratore in avanti

**********************************APPROFONDIMENTO ITERATORI*****************************************
SINTASSI ITERATOR:
ArrayList<String> persone = new ArrayList<String>();
Iterator<String> iteratore = new persone.iterator(); ---> questi tipi di oggetti non possono avere delle primitive ma delle reference
^             ^                          ^
oggetto      Tipo                       dichiarazione iteratore su una
iteratore    oggetto                    lista specifica
             da iterare

System.out.println(iteratore.next());
System.out.println(iteratore.next());
System.out.println(iteratore.next());
^
queste righe di comando daranno risultati sempre diversi (in questo caso mostreranno a schermo righe sempre diverse)
perchè l'iteratore in base all'interazione (ad es. iteratore.next) memorizzerà l'elemento d'iterazione.

L'iteratore di default non parte dal primo elemento ma da un oggetto Null che si trova prima di una lista.

un altro metodo per stampare tutta la lista:

                con hasNext() si controlla la presenza dell'oggetto successivo all'iteratore
                  ^
while(iteratore.hasNext()){
    System.out.println(iteratore.next());
}

uno dei motivi per usare l'iteratore è la sicurezza che si può avere nella rimozione di alcuni elementi 
all'interno di una lista. Ad esempio:

while(iteratore.hasNext()){
    String persona = iteratore.next();
    if(persona =="Anna")
        iteratore.remove(); //--> non passa al prossimo elemento ma rimuove l'elemento memorizzato (l'iteratore è strettamente collegato alle liste)
}



#########NUOVA STRUTTURA DATI LINKED LIST###################
Lista più efficiente nell'aggiunta in un'estrazione casuale.

Per introdurla, bisogna fare un salto indietro

l'array è veloce nell'ottenere un oggetto al suo interno perchè:
ogni cella che contiene elementi nell'array occupa 32 bit
                        |
                        |
                        |
                        v
per sapere ogni elemento basta fare il numero della posizione 
            dell'elemento i per 32 volte(i*32)
                        |
                        |
                        |
                        v
infine basta sommare il tutto per l'indirizzo iniziale
offset= spiazzamento che c'è fra la posizione che si cerca e la posizione 0;

C'è invece la struttura linked list che ha gli elementi posizionati randomicamente in base alla memoria
disponibile

esiste al suo interno un "Node object"(ad esempio un integer), che ha un puntatore next (successivo) che punta ad un'area
dell'heap che ha una celletta fatta allo stesso modo, che ha un puntatore a sua volta che punta ad un'altra celletta che punta
a null (la fine della lista)
esempio grafico:

[1] ---> [7] ---> [2] ---> [4] ---> null


nello sstack e nell'heap saranno:

Stack                                       Heap
_________________________________________________
linkedList<Integer> l
1[0x110011]                ----->    head[0x1100011]----------->[info]--> 1
                                        ^                       [next]
                                        elemento iniziale        ^  |
                                                                 |  v
                                                                [info]--> 7
                                                                [next]
                                                                  ^  |
                                                                  |  v
                                                                [info]--> 2
                                                                [next]
                                                                  ^  |
                                                                  |  v
                                                                [prev.]
                                                                [info]--> 4
                                                                [next]   
                                                                    |
                                                                    v
                                                                  null

se si utilizza il metodo add() con gli arraylist<> sarà molto più efficiente---> add(3, 3)
                                                                                 basterà sostituire (ad esempio)
                                                                                 al valore del next delll'elemento
                                                                                 2 il num 3 e al next di 3 il num 4

la lettura con get(index) non sarà per niente efficiente: bisogna scorrere tutta la lista contando i next per raggiungere
l'elemento all'indice desiderato, cosa non vera con gli arrayList<>

!!! le operazioni si fanno con gli iteratori linked list, proprio per la loro caratteristica data dalla necessità di scorrimento

la linked list, per la sua struttura, è stata creata ed è utilizzata per una collezione dati che necessita di modifiche frequenti.

dichiarazione:

    LinkedList<Integer> ll= new LinkedList<>();

Ma come creare e progettare da soli un oggetto LinkedList?
inanzitutto va introdotta il cosiddetto Package,
che non è altro che una cartella che può avere più classi al suo interno
che hanno come dichiarazione iniziale

package nomedelpackage;

all'interno della classe LinkedList vanno specificati più attributi:
(questo esempio è per una linkedList di soli interi)
private NodoInt testa; //il campo è private perchè la testa, la coda e la lunghezza hanno una definizione precisa che non può essere definita
private NodoInt coda; //in alcun modo dall'utente
private int lunghezza;

andranno definiti successivamente un costruttore e un costruttore per copia

public linkedListInt(){
    this.testa = null;
    this.cida = null;
    this.lunghezza = 0;
}
public linkedListInt(linkedListInt){

}

public linkedList(int[] a){

}

public void addToHead(int info){
    NodoInt nuovaTesta = new NodoInt(info, this.testa);
    this.testa = nuovaTesta;  //graficamente: prima: 3(testa)->4->5->6 ; dopo: nuovatesta->3(vecchiatesta)->4->5->6
    if(this.coda==null){
        this.coda=nuovaTesta; //nel caso la testa sia vuota
    }
    this.lunghezza++;
}

public void addToTail(int info){
    NodoInt nuovaCoda= new NodoInt(info, null);
    if (this.lunghezza==0){
        this.testa = nuovaCoda;
        this.coda= nuovaCoda;
    }
    else{
        this.coda.setSuccessivo(nuovaCoda);
        this.coda= nuovaCoda;
    }
    this.lunghezza++;
}

public void removeFromHead(){
    if(this.lunghezza==0)
        throw new EccezioneListaVuota();  //va implementato correttamente nella classe dell'eccezione ----> ripassare eccezioni
    if(this.lunghezza==1){
        this.coda = null;
        this.testa=null;
    }
    this.testa=this.testa.getSuccessivo();
}

public void removeFromTail(){

}

public int get(int index){
    if(index<0 || index>=this.lunghezza){
        throw new EccezioneIndiceNonValido();
    }
    NodoInt i=this.testa;
    for(int j=0;j<index;j++)
        i=i.getSuccessivo();
    
    return i.getInfo();
}

public String toString(){

}

public boolean equals(Object o){

}

all'interno della classe NodoInt verranno definiti:
private int info;
private NodoInt successivo;

con il costruttore:

public NodoInt(int info, NodoInt successivo){
    this.info = info;
    this.successivo = successivo;
}

con i rispettivi metodi getters e setters, il metodo toString e il metodo equals.

e anche con il metodo:

public boolean haInfo(int info){
    return this.info==info;
}

in generale, tutta la classe LinkedList ingegnerizzata:
package LinkedList;
class NodoInt{
    private Integer Info;
    private NodoInt successivo;
    private NodoInt precedente;
    
    public NodoInt(Integer Info, NodoInt successivo, NodoInt precedente){
        this.Info = Info;
        this.successivo = successivo;
        this.precedente = precedente;
    }
   
    public Integer getInfo() {
        return Info;
    }

   
    
    public void setInfo(Integer Info) {
        this.Info = Info;
    }


    public NodoInt getSuccessivo() {
        return successivo;
    }

    public void setSuccessivo(NodoInt successivo) {
        this.successivo = successivo;
    }

    public String toString() {
        return ""+this.Info;
    };

    public NodoInt getPrecedente() {
        return precedente;
    }

    public void setPrecedente(NodoInt precedente) {
        this.precedente = precedente;
    }

}

public class LinkedList {
    private NodoInt testa;
    private NodoInt coda;
    private int lunghezza;
    
    public LinkedList(){
        this.coda= null;
        this.testa = null;
        this.lunghezza = 0;
        
    }
    public Integer getLunghezza() {
        return lunghezza;
    }

    public void addTesta(Integer infoinfo){
        NodoInt aggiunta = new NodoInt(infoinfo, null, null);
        if(this.lunghezza == 0){
            this.testa = aggiunta;
            this.coda = aggiunta;  //  [2]---> [3] ----> [2] ---> [4]
        }
        else{
            aggiunta.setSuccessivo(this.testa);
            this.testa = aggiunta;
        }
        lunghezza++;
    }

    public void addCoda(Integer infoinfo){
        NodoInt aggiunta = new NodoInt(infoinfo, null, null);
        if(this.lunghezza == 0){
            this.testa = aggiunta;
            this.coda = aggiunta;  //  [2]---> [3] ----> [2] ---> [4]
        }
        else{
            this.coda.setSuccessivo(aggiunta);
            aggiunta.setPrecedente(this.coda);
            this.coda = aggiunta;
        }
        lunghezza++;
    }

    public void removeTesta(){
        if(this.lunghezza ==0){
            //throw new linkedListExceptionHandle();
            System.out.println("error");
        }
        if(this.lunghezza==1){
            this.testa=null;
            this.coda=null;
        }
        else{
            this.testa= this.testa.getSuccessivo();
        }
        this.lunghezza--;
    }

    public void removeCoda(){
        if(this.lunghezza ==0){
            //throw new linkedListExceptionHandle();
            System.out.println("error");
        }
        if(this.lunghezza<=1){
            this.testa=null;
            this.coda=null; 
        }
        else{
            this.coda= this.coda.getPrecedente();
            this.coda.setSuccessivo(null);
        }
        this.lunghezza--;
    }

    public Integer get(int index){
        if(index>=this.lunghezza || index<0){
            //throw new linkedListExceptionHandle();
            return 0;
        }
        
        // if(index>= this.lunghezza/2){
            NodoInt i = this.testa;
            for(int j=0;j<index;j++){
                i = i.getSuccessivo();
            }
            return i.getInfo();
        // }

        // else{
        //     NodoInt i = this.coda;

        //     for(int j=this.lunghezza-2;j>index;j--){
        //         i = i.getPrecedente();
        //     }
        //     return i.getInfo();
        // }

    }
    public String toString(){
        String s = "[";
        for(NodoInt i = this.testa;i!= null;i=i.getSuccessivo()){
            s+= i;
            if(i.getSuccessivo() != null){
                s+=",";
            }
        }
        s+="]";
        return s;
    }
}

recuperare 2 lezioni

#ESERCITAZIONE_PROGRAMMAZIONE_OGGETTI

public static int contaCambioOrdinamento(int[] v){
    if(v==null || v.lenght<=2){
        return 0;
    }
    return contaCambioOrdinamento(v,2)
}

private static int contaCambioRicorsivo(int[] v, int pos){
    boolean ordinamentoCrescente =v[pos-2]<v[pos-1];
    if (pos==v.length)
        return 0;
    if(v[pos]>v[pos-1])
        return contaCambioRicorsivo(v, pos+1);
    else
        if(v[pos]>v[pos-1] && !ordinamentoCrescente)
            return 1+ contaCambioRicorsivo(v, pos+1);
}

private static int contaCambioRicorsivo(int[] v, int pos, boolean ordCorrenteCrescente){ //che considera le uguaglianze
    
    if (pos==v.length)
        return 0;

    boolean prossimoOrdinamento;

    if(v[pos]>v[pos-1])
        prossimoOrdinamento=true;
    else
        if(v[pos]>v[pos-1])
            prossimoOrdinamento=false;
        else
            prossimoOrdinamento = ordCorrenteCrescente;
    
    if(prossimoOrdinamento==ordCorrenteCrescente)
        return contaCambiRicorsivo(v, pos+1,prossimoOrdinamento);
    }


ripasso:

durante la ricorsione, in questo algoritmo, avvengono questi passaggi:

ccR(v,2)--->return ccR(v,3)
ccR(v,3)--->return ccR(v,4)

...etc, alla fine di ogni passo con una condizione di ritornoopopopopopopopo
la funzione ricorsiva ritorna l'ultima condizione e ripete il processo all'inverso



*/