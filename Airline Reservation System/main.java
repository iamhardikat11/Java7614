import java.util.*;
public class Air
{public static void main(String[]Args)
{
int d,e,g;
Scanner sc=new Scanner(System.in);
System.out.println("***************************************************************************************");
System.out.println("*************************WELCOME TO AIRLINE RESERVATION SYSTEM*************************");
System.out.println("(1)Domestic flights");
System.out.println("(2)International flights");
System.out.println("(3)About us");
System.out.println("(4)Services we offer");  
System.out.println("(5)Feedback");

System.out.println("Enter your choice :");
int a=sc.nextInt();
if(a==1)
{
System.out.println("----------------------------------------------------------------------------------------------------------------------");
System.out.println("-----------------------------------------WELCOME TO INDIAN DOMESTIC AVIATION -----------------------------------------");
System.out.println("Companies:");
System.out.println(" 1. SPICE JET");
System.out.println(" 2. DECCAN AIRWAYS");
System.out.println(" 3. INDIGO");
System.out.println("Select the company you opt for :");
int b=sc.nextInt();
if(b==1)
{System.out.println("WELCOME TO SPICE JET :");
System.out.println("------------------------------------------------------------------------------");
System.out.println("Enter Name :"); 
String st=sc.next();
System.out.println("Enter the Origin:"); 
String s=sc.next();
System.out.println("Enter the Destination:");
String s1=sc.next();
System.out.println("Enter the Date of travel:");
String s2=sc.next();
System.out.println("These are The flights Available :");
System.out.println("1. AWD7895 "+s+ " to "+s1+" "+s2+" 14:30 to 18:00");
System.out.println("2. XNB5462 "+s+ " to "+s1+" "+s2+" 11:00 to 14:20");
System.out.println("3. QZX1983 "+s+ " to "+s1+" "+s2+" 16:20 to 20:00");
System.out.println("Choose one from amongst 1,2,3 :");
int c=sc.nextInt();
if(c==1)
{ d=2700;
}
else if(c==2)
{d=3000;
}
else
{d=3200;
}
System.out.println("Bill:");
System.out.println("NAME             ORIGIN             DESTINATION             DATE             COST");
System.out.println(st+"              "+s+"               "+s1+"                "+s2+"            "+d);
System.out.println("----------------------------------------------------------------------------------");
System.out.println("THANK YOU FOR CHOOSING SPICE JET !!!!!!!");
}
else if(b==2)
{System.out.println("WELCOME TO DECCAN AIRWAYS :");
System.out.println("------------------------------------------------------------------------------");
System.out.println("Enter your Name :");
String nm=sc.next();
System.out.println("Enter the Origin:");
String x=sc.next();
System.out.println("Enter the Destination:");
String y=sc.next();
System.out.println("Enter the Date of travel:");
String z=sc.next();
System.out.println("These are The flights Available :");
System.out.println("1. XPG7895 "+x+ " to "+y+" "+z+" 14:30 to 18:00");
System.out.println("2. XOB5462 "+x+ " to "+y+" "+z+" 11:00 to 14:20");
System.out.println("3. GIX1983 "+x+ " to "+y+" "+z+" 16:20 to 20:00");
System.out.println("Choose one from amongst 1,2,3 :");
int pope=sc.nextInt();
if(pope==1)
{ d=2700;
}
else if(pope==2)
{d=3000;
}
else
{d=3200;
}
System.out.println("Bill:");
System.out.println("NAME             ORIGIN             DESTINATION             DATE             COST");
System.out.println(nm+"              "+x+"               "+y+"                  "+z+"            "+d);
System.out.println("----------------------------------------------------------------------------------");
System.out.println("THANK YOU FOR CHOOSING DECCAN AIRWAYS !!!!!!!");
}
else
{System.out.println("WELCOME TO INDIGO :");
System.out.println("------------------------------------------------------------------------------");
System.out.println("Enter your Name :");
String nm1=sc.next();
System.out.println("Enter the Origin:");
String x1=sc.next();
System.out.println("Enter the Destination:");
String y1=sc.next();
System.out.println("Enter the Date of travel:");
String z1=sc.next();
System.out.println("These are The flights Available :");
System.out.println("1. AWD7895 "+x1+ " to "+y1+" "+z1+" 14:30 to 18:00");
System.out.println("2. XNB5462 "+x1+ " to "+y1+" "+z1+" 11:00 to 14:20"); 
System.out.println("3. QZX1983 "+x1+ " to "+y1+" "+z1+" 16:20 to 20:00");
System.out.println("Choose one from amongst 1,2,3 :");
int f=sc.nextInt();
if(f==1)
{ d=2700;
}
else if(f==2)
{d=3000;
}
else
{d=3200;
}
System.out.println("Bill:");
System.out.println("NAME             ORIGIN             DESTINATION             DATE             COST");
System.out.println(nm1+"              "+x1+"               "+y1+"               "+z1+"            "+d);
System.out.println("----------------------------------------------------------------------------------");
System.out.println("THANK YOU FOR CHOOSING INDIGo  !!!!!!!");
}
}
else if(a==2)
{System.out.println("-----------------------------------------WELCOME TO INTERNATIONAL AVIATION-----------------------------------------");
 System.out.println("Companies:");
 System.out.println("1. QANTAS AIRWAYS. ");
 System.out.println("2. VIRGIN ATLANTIC AIRWAYS .");
 System.out.println("3. CATHAY PACIFIC AIRWAYS .");
 System.out.println("4. LUFTHANSA .");
 System.out.println("5. EMIRATES .");
 System.out.println("Enter the company number in ehich you want to travel :");
 g=sc.nextInt();
 if(g==1)
 {System.out.println("WELCOME TO QANTAS AIRWAYS :");
System.out.println("------------------------------------------------------------------------------");
System.out.println("Enter your Name :");
String nm2=sc.next();
System.out.println("Enter the Origin:");
String p=sc.next();
System.out.println("Enter the Destination:");
String q=sc.next();
System.out.println("Enter the Date of travel:");
String r=sc.next();
System.out.println("These are The flights Available :");
System.out.println("1. POB7895 "+p+ " to "+q+" "+r+" 14:30 to 1:00");
System.out.println("2. XEN5462 "+p+ " to "+q+" "+r+" 11:00 to 22:20"); 
System.out.println("3. GIC1983 "+p+ " to "+q+" "+r+" 16:20 to 23:45");
System.out.println("Choose one from amongst 1,2,3 :");
int o=sc.nextInt();
if(o==1)
{ d=10400;
}
else if(o==2)
{d=16500;
}
else
{d=13200;
}
System.out.println("Bill:");
System.out.println("NAME             ORIGIN             DESTINATION             DATE             COST");
System.out.println(nm2+"              "+p+"               "+q+"                 "+r+"              "+d);
System.out.println("----------------------------------------------------------------------------------");
System.out.println("THANK YOU FOR CHOOSING QUANTAS  !!!!!!!");
 }
 else if(g==2)
 {System.out.println("WELCOME TO VIRGIN ATLANTIC AIRWAYS :");
System.out.println("------------------------------------------------------------------------------");
System.out.println("Enter your Name :");
String nm3=sc.next();
System.out.println("Enter the Origin:");
String k=sc.next();
System.out.println("Enter the Destination:");
String l=sc.next();
System.out.println("Enter the Date of travel:");
String m=sc.next();
System.out.println("These are The flights Available :");
System.out.println("1. POB7895 "+k+ " to "+l+" "+m+" 14:30 to 18:00");
System.out.println("2. XEN5462 "+k+ " to "+l+" "+m+" 11:00 to 14:20"); 
System.out.println("3. GIC1983 "+k+ " to "+l+" "+m+" 16:20 to 20:00");
System.out.println("Choose one from amongst 1,2,3 :");
int t=sc.nextInt();
if(t==1)
{ d=15400;
}
else if(t==2)
{d=13200;
}
else
{d=16800;
}
System.out.println("Bill:");
System.out.println("NAME             ORIGIN             DESTINATION             DATE             COST");
System.out.println(nm3+"              "+k+"               "+l+"                 "+m+"              "+d);
System.out.println("----------------------------------------------------------------------------------");
System.out.println("THANK YOU FOR CHOOSING VIRGIN ATLANTIC !!!!!!!");
 }
  else if(g==3)
 {System.out.println("WELCOME TO CATHAY PACIFIC AIRWAYS :");
System.out.println("------------------------------------------------------------------------------");
System.out.println("Enter your Name :");
String nm4=sc.next();
System.out.println("Enter the Origin:");
String or=sc.next();
System.out.println("Enter the Destination:");
String de=sc.next();
System.out.println("Enter the Date of travel:");
String da=sc.next();
System.out.println("These are The flights Available :");
System.out.println("1. POB7895 "+or+ " to "+de+" "+da+" 14:30 to 18:00");
System.out.println("2. XEN5462 "+or+ " to "+de+" "+da+" 11:00 to 14:20"); 
System.out.println("3. GIC1983 "+or+ " to "+de+" "+da+" 16:20 to 20:00");
System.out.println("Choose one from amongst 1,2,3 :");
int op=sc.nextInt();
if(op==1)
{ d=12700;
}
else if(op==2)
{d=13500;
}
else
{d=15200;
}
System.out.println("Bill:");
System.out.println("NAME             ORIGIN             DESTINATION             DATE             COST");
System.out.println(nm4+"              "+or+"               "+de+"               "+da+"            "+d);
System.out.println("----------------------------------------------------------------------------------");
System.out.println("THANK YOU FOR CHOOSING CATHAY PACIFIC !!!!!!!");
 }
  else if(g==4)
 {System.out.println("WELCOME TO LUFTHANSA :");
System.out.println("------------------------------------------------------------------------------");
System.out.println("Enter your Name :");
String nma=sc.next();
System.out.println("Enter the Origin:");
String po=sc.next();
System.out.println("Enter the Destination:");
String qo=sc.next();
System.out.println("Enter the Date of travel:");
String ro=sc.next();
System.out.println("These are The flights Available :");
System.out.println("1. POB7895 "+po+ " to "+qo+" "+ro+" 14:30 to 18:00");
System.out.println("2. XEN5462 "+po+ " to "+qo+" "+ro+" 11:00 to 14:20"); 
System.out.println("3. GIC1983 "+po+ " to "+qo+" "+ro+" 16:20 to 20:00");
System.out.println("Choose one from amongst 1,2,3 :");
int ot=sc.nextInt();
if(ot==1)
{ d=12700;
}
else if(ot==2)
{d=16200;
}
else
{d=13200;
}
System.out.println("Bill:");
System.out.println("NAME             ORIGIN             DESTINATION             DATE             COST");
System.out.println(nma+"              "+po+"               "+qo+"              "+ro+"              "+d);
System.out.println("----------------------------------------------------------------------------------");
System.out.println("THANK YOU FOR CHOOSING LUFTHANSA  !!!!!!!");
 }
  else if(g==5)
 {System.out.println("WELCOME TO EMIRATES  :");
System.out.println("------------------------------------------------------------------------------");
System.out.println("Enter your Name :");
String nmb=sc.next();
System.out.println("Enter the Origin:");
String pop=sc.next();
System.out.println("Enter the Destination:");
String qoq=sc.next();
System.out.println("Enter the Date of travel:");
String row=sc.next();
System.out.println("These are The flights Available :");
System.out.println("1. POB7895 "+pop+ " to "+qoq+" "+row+" 14:30 to 18:00");
System.out.println("2. XEN5462 "+pop+ " to "+qoq+" "+row+" 11:00 to 14:20"); 
System.out.println("3. GIC1983 "+pop+ " to "+qoq+" "+row+" 16:20 to 20:00");
System.out.println("Choose one from amongst 1,2,3 :");
int ope=sc.nextInt();
if(ope==1)
{ d=12700;
}
else if(ope==2)
{d=14600;
}
else
{d=13200;
}
System.out.println("Bill:");
System.out.println("NAME             ORIGIN             DESTINATION             DATE             COST");
System.out.println(nmb+"             "+pop+"             "+qoq+"               "+row+"            "+d);
System.out.println("----------------------------------------------------------------------------------");
System.out.println("THANK YOU FOR CHOOSING EMIRATES !!!!!!!");
 }
 else
 {System.out.println("INVALID CHOICE !!!!");
 }
 }
else if(a==3)
{System.out.println("1. SPICE JET .");
 System.out.println("2. DECCAN AIRWAYS .");
 System.out.println("3. INDIGO .");
 System.out.println("4. QANTAS AIRWAYS. ");
 System.out.println("5. VIRGIN ATLANTIC AIRWAYS .");
 System.out.println("6. CATHAY PACIFIC AIRWAYS .");
 System.out.println("7. LUFTHANSA .");
 System.out.println("8. EMIRATES .");
 System.out.println("ENTER THE SERIAL NUMBER OF COMPANY OF WHOSE YOU WANT INFORMATION :");
 e=sc.nextInt();
 if(e==1)
 {System.out.println("SpiceJet is a low-cost airline headquartered in Gurugram, India.");
 System.out.println ("It is the third largest airline in the country by number of domestic passengers carried, with a market share of 14.2% as of July 2017.");
 System.out.println("The airline operates 312 daily flights to 55 destinations, including 45 Indian and 10 international destinations from its hubs at Delhi, Kolkata and Hyderabad.");
 System.out.println("Established as air taxi provider ModiLuft in 1994, the company was acquired by Indian entrepreneur Ajay Singh in 2004 and re-christened as SpiceJet. ");
 System.out.println("The airline operated its first flight in May 2005. Indian media baron Kalanidhi Maran acquired a controlling stake in SpiceJet in June 2010 through Sun Group which was sold back to Ajay Singh in January 2015."); 
 System.out.println("The airline operates a fleet of Boeing 737 and Bombardier Dash aircraft.");
 }
 else if(e==2)
 {System.out.println("Deccan Airways Limited was a commercial airline based in Hyderabad. Founded in 1945, it was one of the nine airlines existing in India during independence.");
  System.out.println("The airline, a joint venture of Nizam Government of erstwhile Hyderabad State and Tata Airlines was launched with a fleet of three aircraft. ");
  System.out.println(" By the time it was merged with Indian Airlines in 1953, it had a fleet of thirteen Douglas DC-3 'Dakota' aircraft. ");
  System.out.println("The airline operated on Madras-Hyderabad-Nagpur- Bhopal-Gwalior-Delhi, Hyderabad-Bombay and Hyderabad-Bangalore sectors.");
  System.out.println("71 per cent of Deccan Airways was owned by the Nizam's Government and the rest was owned by Tata Sons and others. ");
  System.out.println("Its first flight began in July 1946. The DC-3 aircraft were brought from US Air Force at a throw away price after they were left unused at Assam after World War 2. ");
  System.out.println("Hyderabad had five airfields with concrete runways in Aurangabad, Warangal, Bidar, Hakimpet and Begumpet. In 1952 Government of India held 78% of shares of Deccan Airways. ");
  System.out.println("The shares were acquired from the Hyderabad Government & Nizam State Railways. 13% of the shares was still held by Tatas & 9% by the general public");
  System.out.println("In 1953 Deccan Airways Limited along with seven other airlines under the Air Corporations Act were merged to form a single domestic carrier called Indian Airlines Corporation (IAC).") ;
 System.out.println("After this on 10 October 1953, Deccan Airways resigned its associate membership of IATA.");
 }
 else if(e==3)
 {
     System.out.println("IndiGo is a low-cost airline headquartered at Gurgaon, Haryana, India. ");
     System.out.println("It is the largest airline in India by passengers carried and fleet size, with a 38.7% market share as of July 2017.");
     System.out.println("It is also the largest individual Asian low-cost carrier in terms of jet fleet size and passengers carried, and the eighth largest carrier in Asia with over 41 million passengers carried in 2016. ");
     System.out.println("The airline operates to 46 destinations both domestic and international. It has its primary hub at Indira Gandhi International Airport, Delhi.");
     System.out.println("The airline was founded as a private company, by Rahul Bhatia of InterGlobe Enterprises; and Rakesh Gangwal, a United States-based expatriate Indian; in 2006. ");
     System.out.println("It took delivery of its first aircraft in July 2006 and commenced operations a month later. ");
     System.out.println("The airline became the largest Indian carrier in passenger market share in 2012. ");
     System.out.println("The company went public in November 2015.");
 }
 else if(e==4)
 {System.out.println("Qantas Airways is the flag carrier airline of Australia and its largest airline by fleet size, international flights and international destinations.");
  System.out.println("It is the third oldest airline in the world, after KLM and Avianca[6] having been founded in November 1920; it began international passenger flights in May 1935.");
  System.out.println("The Qantas name comes from \"QANTAS\", an acronym for its original name, \"Queensland and Northern Territory Aerial Services\", and it is nicknamed \"The Flying Kangaroo\".");
  System.out.println("Qantas is a founding member of the Oneworld airline alliance.");
  System.out.println("The airline is based in the Sydney suburb of Mascot with its main hub at Sydney Airport.");
  System.out.println("As of March 2014, Qantas had a 65% share of the Australian domestic market and carried 14.9% of all passengers travelling in and out of Australia.");
  System.out.println("Various subsidiary airlines operate to regional centres and on some trunk routes within Australia under the QantasLink banner. Its subsidiary Jetconnect provides services between Australia and New Zealand, flying under the Qantas brand.");
  System.out.println("Qantas also owns Jetstar Airways, a low-cost airline that operates both international services from Australia and domestic services within Australia and New Zealand; and holds stakes in a number of other Jetstar-branded airlines.");
 }
 else if(e==5)
{System.out.println("Virgin Atlantic, a trade name of Virgin Atlantic Airways Limited and Virgin Atlantic International Limited, is a British airline with its head office in Crawley, United Kingdom.");
 System.out.println("The airline was established in 1984 as British Atlantic Airways, and was originally planned by its co-founders Randolph Fields and Alan Hellary to fly between London and the Falkland Islands.");
 System.out.println("Soon after changing the name to Virgin Atlantic Airways, Fields sold his shares in the company after disagreements with Sir Richard Branson over the management of the company."); 
 System.out.println("The maiden flight from London Gatwick to Newark Liberty International Airport took place on 22 June 1984.");
 System.out.println("The airline along with Virgin Holidays is controlled by a holding company, Virgin Atlantic Limited, which is 51% owned by the Virgin Group and 49% by Delta Airlines. It is administratively separate from other Virgin-branded airlines.");
 System.out.println("Virgin Atlantic uses a mixed fleet of Airbus and Boeing wide-body aircraft and operates to destinations in North America, the Caribbean, Africa, the Middle East and Asia from its main bases at London Heathrow and London Gatwick, and its secondary base at Manchester.");
 System.out.println("The airline also operates flights from Glasgow, and seasonal flights from Belfast."); 
 System.out.println("Virgin Atlantic aircraft consist of three cabins: Economy, Premium Economy and Upper Class.");
 System.out.println("In 2012, Virgin Atlantic carried 5.4 million passengers,making it the seventh-largest UK airline in terms of passenger volume."); 
 System.out.println("In the year to 31 December 2013, it reported a �51 million group pre-tax loss (approximately US$87 million),however, in the year to 31 December 2014 the airline reported a return to pre-tax profit of �14.4 million.");
 System.out.println("Virgin Atlantic Airways Limited and Virgin Atlantic International Limited both hold Civil Aviation Authority (CAA) Type A Operating Licences (AOC numbers 534 and 2435 respectively), both of which permit these airlines, operating as Virgin Atlantic Airways, to carry passengers, cargo and mail on aircraft with 20 or more seats.");
 }
 else if(e==6)
 { System.out.println("Cathay Pacific(SEHK: 0293) is the flag carrier of Hong Kong, with its head office and main hub located at Hong Kong International Airport.");
   System.out.println("The airline's operations and subsidiaries have scheduled passenger and cargo services to 180[1] destinations in 44 countries worldwide including codeshares and joint ventures."); 
   System.out.println("Cathay Pacific operates a fleet of wide-body aircraft, consisting of Airbus A330, Airbus A350, and Boeing 777 equipment."); 
   System.out.println("Its wholly owned subsidiary, Cathay Dragon, operates to 44 destinations in the Asia-Pacific region from its Hong Kong base.");
   System.out.println("In 2010, Cathay Pacific, together with Dragonair (rebranded Cathay Dragon), carried nearly 27 million passengers and over 1.8 million tons of cargo and mail.");
   System.out.println("The airline was founded on September 24, 1946 by Australian Sydney H. de Kantzow and American Roy C. Farrell, with each man putting up HK$1 to register the airline."); 
   System.out.println("The airline made the world's first non-stop transpolar flight flying over the North Pole in July 1998, which was also the maiden flight to arrive at the then new Hong Kong International Airport.");
   System.out.println("The airline celebrated its 60th anniversary in 2006; and as of October 2009, its major shareholders are Swire Pacific and Air China. It is reciprocally one of the major shareholders of Air China."); 
   System.out.println("Cathay Pacific is the world's tenth largest airline measured in terms of sales, and fourteenth largest measured in terms of market capitalisation."); 
   System.out.println("In 2010, Cathay Pacific became the world's largest international cargo airline, along with main hub Hong Kong International Airport as the world's busiest airport in terms of cargo traffic.");
   System.out.println("It is a founding member of the Oneworld alliance. Cathay Pacific's subsidiary Cathay Dragon is an affiliate member of Oneworld.");
   System.out.println("Cathay Pacific is an award-winning and globally reputed airline, winning the \"World's Best Airline\" award four times and consistently ranking as among the best airlines in the world.");
 }
 else if (e==7)
 { System.out.println("Deutsche Lufthansa  , commonly known as Lufthansa (sometimes also as Lufthansa German Airlines), is the largest German airline and, when combined with its subsidiaries, also the largest airline in Europe, in terms of fleet size, and the second largest airline in terms of passengers carried during 2016."); 
   System.out.println("It operates services to 18 domestic and 197 international destinations in 78 countries across Africa, the Americas, Asia, and Europe, using a fleet of more than 270 aircraft.");
   System.out.println("Lufthansa is one of the five founding members of Star Alliance, the world's largest airline alliance, formed in 1997. The name of the company is derived from Luft 'air' and Hansa, the Hanseatic League.");
   System.out.println("Besides its own passenger airlines Austrian Airlines, Swiss International Airlines, Brussels Airlines, and Eurowings including Germanwings (referred to in English by Lufthansa as its Passenger Airline Group), Deutsche Lufthansa AG owns several aviation-related companies such as Lufthansa Technik as part of the Lufthansa Group."); 
   System.out.println("Combined with its subsidiaries, the group has 656 aircraft, as of February 2016, making it one of the largest passenger airline fleets in the world. In 2014, the group carried over 106 million passengers.");
   System.out.println("Lufthansa's registered office and corporate headquarters are in Cologne. The main operations base, called Lufthansa Aviation Center (LAC), is at Lufthansa's primary hub at Frankfurt Airport."); 
   System.out.println("The majority of Lufthansa's pilots, ground staff, and flight attendants are based there.");
   System.out.println("Lufthansa's secondary hub is Munich Airport.");
   System.out.println("Lufthansa was a state-owned enterprise (and flag carrier) until 1994."); 
   System.out.println("In 2014, 60% of Lufthansa's shares were held by institutional investors."); 
   System.out.println("The remaining 40% were held by individual stock owners. Since 1970, Lufthansa has involved its employees in profit sharing, giving them the opportunity to choose between cash and preference shares.");
   System.out.println("When Lufthansa was privatised, employees received more than 3% of its shares.");
 }
 else if (e==8)
 {System.out.println("Emirates is an airline based in Dubai, United Arab Emirates.");
  System.out.println("The airline is a subsidiary of The Emirates Group, which is wholly owned by the government of Dubai's Investment Corporation of Dubai.");
  System.out.println("It is the largest airline in the Middle East,[4] operating over 3,600 flights per week from its hub at Dubai International Airport, to more than 140 cities in 81 countries across six continents."); 
  System.out.println("Cargo activities are undertaken by Emirates SkyCargo.");
  System.out.println("An Emirates A380-800 (A6-EUE) taking off from New York JFK Airport.");
  System.out.println("Emirates is the world's fourth largest airline by scheduled revenue passenger-kilometers flown, the fourth-largest in terms of international passengers carried, and the second-largest in terms of freight tonne kilometers flown."); 
  System.out.println("Emirates had the longest non-stop commercial flight from Dubai to Auckland until it was surpassed by Qatar Airways flying from Doha to Auckland.");
  System.out.println("During the mid-1980s, Gulf Air began to cut back its services to Dubai. As a result, Emirates was conceived in March 1985 with backing from Dubai's royal family, with Pakistan International Airlines providing two of the airline's first aircraft on wet-lease."); 
  System.out.println("With $10 million in start-up capital it was required to operate independently of government subsidy."); 
  System.out.println("Pakistan International Airlines provided training facilities to Emirates' cabin crew in its academy."); 
  System.out.println("The airline was headed by Ahmed bin Saeed Al Maktoum, the airline's present chairman. In the years following its founding, the airline expanded both its fleet and its destinations."); 
  System.out.println("In October 2008, Emirates moved all operations at Dubai International Airport to Terminal 3.");
  System.out.println("Emirates operates a mixed fleet of Airbus and Boeing wide-body aircraft and is one of the few airlines to operate an all-wide-body aircraft fleet."); 
  System.out.println("As of September 2016, Emirates is the largest Airbus A380 operator with 96 planes in service and a further 46 in orders."); 
  System.out.println("Since their introduction, the Airbus A380 has become an integral part of Emirates fleet, especially on long-haul high-traffic routes.");
  System.out.println("Emirates is also the world's largest Boeing 777 operator with over 130 planes in service.");
 }
 else
 { System.out.println("INVALID CHOICE");
 }
}
else if(a==4)
{System.out.println("Special Assistance");
System.out.println("Our employees are trained to assist our differently-abled passengers and for any sorts of limitations, we offer a wide variety of special assistance.");
System.out.println("You can obtain information in advance regarding the assistance we offer, either through this website or by contacting our Reservations on +919871803333/ +919654003333.");
System.out.println("Please be aware that there might be unpredictable circumstances such as weather or mechanical problems that may call for a last minute unavoidable change, but we will do our best to accommodate your needs.");
System.out.println("Onboard Facilities:");
System.out.println("Following assistance are available on-board aircraft:");
System.out.println("*Assistance in moving to and from seats/lavatory.");
System.out.println("*Help in preparation for eating.");
System.out.println("However, we express our inability to provide passengers with any assistance for personal care needs on-board, such as, eating/ drinking, administration of medication, elimination functions including assistance inside the lavatory, or other personal care needs. If you require assistance with any of these, we recommend that you travel with a personal care attendant.");
System.out.println("Seating accommodation and aircraft accessibility for differently-abled passengers:");
System.out.println("We will do our best to allocate you a seat that is most suitable to your needs. However, in order to meet the safety requirements as prescribed by the DGCA, passengers with mobility limitations which make it unsafe to facilitate aircraft evacuations will not be given a seat in a location where they would obstruct emergency exits, impede the crew in their duties, obstruct access to emergency equipment or hinder aircraft evacuation");
System.out.println("Accessible Lavatories:");
System.out.println("*A lavatory with a single panel door is available on all our aircraft. Our cabin crew can provide you with assistance moving to and from the lavatory door but will not be able to assist you inside the lavatory.");
System.out.println("WE offer special services for the following:");
System.out.println("*Wheelchair users or passengers using wheelchairs (mobility assistance);");
System.out.println("*Passengers travelling with crutches/ braces/ other prosthetic devices;");
System.out.println("*Passengers with Visual Impairment;");
System.out.println("*Passengers Travelling with Certified Guide Dogs;");
System.out.println("*Passengers with Hearing Impairment;");
System.out.println("*Passenger travelling with spinal support;");
System.out.println("*Passenger travelling with an assistant for medical purposes;");
System.out.println("*Passengers with intellectual/ developmental/ learning disabilities;");
System.out.println("*Passengers travelling with Internal Medical Devices;");
System.out.println("*Passengers who require a stretcher;");
System.out.println("*Passengers requiring oxygen aid;");
}
else if(a==5)
{System.out.println("YOUR FEEDBACK IS MOST AUSPICIOUS TO US :");
 System.out.println("Enter your Name :");
 String name=sc.next();
 System.out.println("Enter Your Email :");
 String em=sc.next();
 System.out.println("Enter your Mobile number :");
 long lg=sc.nextLong();
 System.out.println("Enter the type of company for whom You want to give your Complaint/Suggestion/Feedback");
 String em1=sc.next();
 System.out.println("Enter PNR :");
 long log=sc.nextLong();
 System.out.println("Enter Type of complaint :");
 String name1=sc.next();
 System.out.println("Comments:");
 String name2=sc.next();
 System.out.println("*********************************************************THANK YOU FOR YOUR FEEDBACK********************************************************* ");
}
}
}
