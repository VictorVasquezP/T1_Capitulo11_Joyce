/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Chapter11.Book;
import Chapter11.BookArray;
import Chapter11.Bridge;
import Chapter11.Cuadrado;
import Chapter11.Cuadrado2;
import Chapter11.DomesticDivision;
import Chapter11.ElementsArray;
import Chapter11.Fiction;
import Chapter11.FullTime;
import Chapter11.GeometryArray;
import Chapter11.InternationalDivision;
import Chapter11.MetalElement;
import Chapter11.NoMetalElement;
import Chapter11.NonFiction;
import Chapter11.Novel;
import Chapter11.Novella;
import Chapter11.PartTime;
import Chapter11.ShortStory;
import Chapter11.StoryDemo;
import Chapter11.Triangulo;
import Chapter11.Triangulo2;
import Chapter11.UseGeometric2;
import java.lang.Iterable;
import java.math.MathContext;
import Chapter11.BusinessLoan;
import Chapter11.PersonalLoan;
import Chapter11.CreateLoans;
import Chapter11.Jupiterian;
import Chapter11.Martian;
import Chapter11.Poker;
import Chapter11.Actor;
import Chapter11.Chevy;
import Chapter11.Child;
import Chapter11.Ford;
import Chapter11.Health;
import Chapter11.House;
import Chapter11.IncomingPhoneCall;
import Chapter11.Leaf;
import Chapter11.Life;
import Chapter11.Musician;
import Chapter11.OutgoingPhoneCall;
import Chapter11.Page;
import Chapter11.Pancake;
import Chapter11.PhoneCallArray;
import Chapter11.School;
import Chapter11.SevenDaySubscriber;
import Chapter11.WeekdaySubscriber;
import Chapter11.WeekendSubscribers;

/**
 *
 * @author Victor
 */
public class main {
    public static void main(String [] args){
        System.out.println("\n\t\tBook, Fiction & NonFiction");
        Fiction fiction = new Fiction("Cronicas de una muerte anunciada",00.0);        
        System.out.println(fiction);
        NonFiction nofiction = new NonFiction("El titanic",00.0);
        System.out.println(nofiction);
        System.out.println("\n\t\tBookArray");
        BookArray lib = new BookArray();
        lib.add(new Fiction("Creed",00.0));
        lib.add(new NonFiction("El resplandor",00.0));
        lib.imprimir();
        //incluir mas 
        System.out.println("\n\t\tPhoneCall & IncomingPhoneCall");
        IncomingPhoneCall incPh=new IncomingPhoneCall("965323");
        System.out.println(incPh);
        OutgoingPhoneCall outP=new OutgoingPhoneCall("563627",5);
        System.out.println(outP);
        PhoneCallArray phones = new PhoneCallArray();
        phones.add(outP);
        phones.add(incPh);
        phones.imprimir();
        
        System.out.println("\n\t\tAuto, Ford, Chevy");
        Ford f= new Ford("Ford",20000);
        System.out.println(f);
        Chevy c=new Chevy("Cheby",189000);
        System.out.println(c);
        
        System.out.println("\n\t\tDivision, InternationalDivision & DomesticDivision");
        InternationalDivision inter = new InternationalDivision("Division 1",3423,"Mexico","Español latino");
        inter.display();
        DomesticDivision dom = new DomesticDivision("Division 2",24563,"Oaxaca");
        dom.display();
        System.out.println("\n\t\tElement, MetalElement & NoMetalElement");
        MetalElement metal1= new MetalElement("Hierro","Fe",26,55.865f);
        MetalElement metal2= new MetalElement("Calcio","Ca",20,40.078f);
        NoMetalElement nometal=new NoMetalElement("Hidrogeno","H",1,1.00797f);
        NoMetalElement nometa2=new NoMetalElement("Helio","He",2,4.0026f);
        System.out.println(metal1);
        System.out.println(metal2);
        System.out.println(nometal);
        System.out.println(nometa2);
        System.out.println("\n\t\tElementsArray");
        ElementsArray arrayE= new ElementsArray();
        arrayE.add(metal1);
        arrayE.add(metal2);
        arrayE.add(nometal);
        arrayE.add(nometa2);
        arrayE.imprimir();
        
        System.out.println("\n\t\nNewspaperSubscriber, WeekdaySubscriber, WeekendSubscriber & SevenDaySubscriber");
        SevenDaySubscriber sevenD=new SevenDaySubscriber("Vicente");
        System.out.println(sevenD);
        WeekdaySubscriber weekS=new WeekdaySubscriber("Nicolas");
        System.out.println(weekS);
        WeekendSubscribers weekSs=new WeekendSubscribers("Porfirio");
        System.out.println(weekSs);
        
        System.out.println("\n\t\tStory, Novel, Novella, ShortStory && StoryDemo");
        Novel n1=new Novel("50 sombras","Karimnot",400);
        Novella nl1=new Novella("Luna","Victor",67);
        ShortStory sh1=new ShortStory("Patito feo","Erick",34);
        //sin las reglas
        Novel n2=new Novel("50 sombras2","Karimnot",50);
        Novella nl2=new Novella("Sol","Victor",34);
        ShortStory sh2=new ShortStory("Patito chido","Erick",79);
        StoryDemo sd = new StoryDemo();
        sd.add(n1);
        sd.add(n2);
        sd.add(nl1);
        sd.add(nl2);
        sd.add(sh1);
        sd.add(sh2);
        sd.imprimir();
        
        System.out.println("\n\t\tTurner, Leaf, Page, Pancake");
        Leaf leaf=new Leaf();
        leaf.turn();
        Page page=new Page();
        page.turn();
        Pancake pank=new Pancake();
        pank.turn();
        
        System.out.println("\n\t\tLife, Health & Insure");
        Health health=new Health("VIda");
        Life life=new Life("Salud");
        System.out.println(health);
        System.out.println(life);
        
        System.out.println("\n\t\tGeometicFigure, Cuadrado, Triangulo, GeometryArray");
        Cuadrado cua = new Cuadrado(4,4,"Cuadrado");
        Triangulo tri = new Triangulo(6,5,"Triangulo");
        GeometryArray geom=new GeometryArray();
        geom.add(tri);
        geom.add(cua);
        geom.imprimir();
        
        System.out.println("\n\t\tGeometricFigure2, Cuadrado2, Triangulo2, SidedObject &UseGeometric");
        Cuadrado2 cuad2=new Cuadrado2(7,5,"Cuadrado");
        Triangulo2 tria2 = new Triangulo2(8,4,"Triangulo");
        UseGeometric2 useG=new UseGeometric2();
        useG.add(tria2);
        useG.add(cuad2);
        useG.imprimir();
        
        System.out.println("\n\t\tPlayer, Child, Actor & Musician");
        Child ch=new Child();
        ch.play();
        Musician m=new Musician();
        m.play();;
        Actor a=new Actor();
        a.play();
        
        System.out.println("\n\t\t Student, FullTime & PartTime");
        FullTime full=new FullTime("Victor",true);
        PartTime part = new PartTime("Manuel",false);
        System.out.println(full);
        System.out.println(part);
        
        System.out.println("\n\t\tBuilding, Horse & School");
        House ho=new House(34,"Antigua",45,343);
        System.out.println(ho);
        School sc=new School(23,"Fecha debajo de un cementerio",34,"Universidad");
        System.out.println(sc);
        
        System.out.println("\n\t\tLoan, LoanConstants, BusinessLoan, PersonalLoan & CreateLoans");
        BusinessLoan busin = new BusinessLoan(1,"Poblete",5800,2);
        BusinessLoan busin2 = new BusinessLoan(2,"Suarez",110800,5);
        PersonalLoan per1=new PersonalLoan(3,"Perez",2000,3);
        PersonalLoan per2=new PersonalLoan(4,"Juarez",220000,5);
        CreateLoans arreglo=new CreateLoans();
        arreglo.add(busin);
        arreglo.add(busin2);
        arreglo.add(per1);
        arreglo.add(per2);
        arreglo.imprimir();
        
        System.out.println("\n\t\tGame Zone");
        Martian marciano=new Martian();
        System.out.println(marciano);
        Jupiterian jupiter = new Jupiterian();
        System.out.println(jupiter);
        
        System.out.println("\n\t\tPoker");
        Poker poker = new Poker();
        Bridge bridge=new Bridge();
        System.out.println(poker.displayDescription());
        System.out.println(bridge.displayDescription());
        
        
    }
}
