import java.util.*;
import java.io.*;
import java.awt.Desktop;
import java.net.URI;

class ChoiceList{
	int a,b,c;
    Scanner in= new Scanner(System.in);
	void choice(){
		System.out.print("\n\t\t\t\t\tEnter Your Choice: ");
		a=in.nextInt();
		switch (a){
		case 1:
		new Medical().home();
		break;
		case 2:
		new FindDisease().findDisease();
		break;
		case 3:
		new PharmacyList().Pharmacy();
		break;
		case 4:
		new PrecautionList().Precautions();
		break;
		case 5:
		new DoctorList().Rec_Doc();
		break;
		case 6:
		System.out.println("\n\t\t\t1: Contact us\n\t\t\t2: Help\n\t\t\t3: Back To Home");
        System.out.print("\n\t\t\tEnter Your Choice: ");
		b= in.nextInt();
		if(b==1)
		new Medical().contact();
		else if(b==2)
		new Medical().help();
		else if(b==3)
	    new Medical().home();
		else
		System.out.println("\n\t\t\t\tInvalid Choice Or Network Issue..!!!!");
		break;
		case 7:
		System.out.println("\n\t\t\t\t\t\t***About***");
		System.out.println("\n\tMedical Treatment is a holistic healthcare company that aims to make healthcare accessible\n\tand affordable in the country. In order to streamline the functioning of the health\n\tindustry, we have brought doctors, pharmacists, phlebotomists and consumers under one\n\tdigital ambit. This will save you from the burden of waiting in long queues, riding to a\n\tmedical store or visiting a doctor.");
		System.out.println("\n\t\t\t\t\t\t***Vision***");
		System.out.println("\n\tImprove health outcomes for consumers by making it simple, personal, accessible and affordable.");
		System.out.println("\n\t\t\t\t\t\t***Mission***");
		System.out.println("\n\tUse technology to make Medical Treatment the trusted partner for 100+ million customers for\n\tall of their healthcare needs.");
		System.out.println("\n\t\t\t\t\t\t***Our Story***");
		System.out.println("\n\tWe started with a simple thought of providing affordable and accessible healthcare services\n\tfor all in the country. Founded by Vivek Jain in 2020, You can order online medicines\n\tand wellness products, choose recommended doctor for which sample is collected at\n\tyour home/office. Currently, we provide healthcare services.");
		System.out.println("\n\t\t\t\t\t\t***Leadership***");
		System.out.println("\n\t\t\t\t\t  CEO & Co-Founder: Vivek Jain");
			
		System.out.print("\n\n\tBack To Home(Enter Any Number): ");
		c=in.nextInt();
		if(c>=0)
		new Medical().home();
		break;
		case 8:
		System.out.print("\n\n\t\t\t\t1: Admin Login");
		System.out.print("\n\n\t\t\t\t\tEnter Your Choice: ");
	    int d= in.nextInt();
	    if (d==1){
		new ALogin().AdminLogin();
	    } }
		System.out.println("\n\t\t\t\tInvalid Choice Or Network Issue..!!!!");
		System.out.print("\n\n\t\t\tBack To Home(Enter Any Number): ");	
	    c=in.nextInt();
	    if(c>=0)
	    new Medical().home();
    }
}

class Open_Code {
    void Open_URL(){ 
    try  
    {  
    File file = new File("C:\\Users\\HP\\Desktop\\MCA\\Medical.java");   
    if(!Desktop.isDesktopSupported())
    {  
    System.out.println("not supported");  
    return;  
    }  
    Desktop desktop = Desktop.getDesktop();  
    if(file.exists())         
    desktop.open(file);            
    }  
    catch(Exception e)  
    {  
    e.printStackTrace();  
    }  
 }}

class Url {
    void Open_URL(){ 
    try { 
    URI uri= new URI("https://github.com/vj8982/Medical-Treatment/commit/8bb858103334dcd002481af3f5e6e129318755f9"); 
    java.awt.Desktop.getDesktop().browse(uri);
    System.out.println("\n\n\t\t\t\t******Web page opened in browser******");
    } 
	catch (Exception e) {
    e.printStackTrace();
  }
 }}

class ALogin {
	int c;
	void AdminLogin(){
    String Username;
    String Password;

    Password = "jain";
    Username = "vivek";
    Scanner in = new Scanner(System.in);
    Scanner input1 = new Scanner(System.in);
	System.out.print("\n********************************************** Admin Login ***********************************************");
    System.out.print("\n\n\t\t\t\tEnter Username : ");
    String username = input1.next();

    Scanner input2 = new Scanner(System.in);
    System.out.print("\n\t\t\t\tEnter Password : ");
    String password = input2.next();

    if (username.equals(Username) && password.equals(Password)) {
        System.out.println("\n\t\t\t\t\t  ***Access Granted***");
		System.out.println("\n\t\t\t\t***Welcome Medical Treatment Management***");
		System.out.println("\n\n\t\t\t\t\t1. Add/Edit Code\n\t\t\t\t\t2. View Code\n\t\t\t\t\t3. Back to home");
        
		System.out.print("\n\t\t\t\t\tEnter Your Choice: ");	
	    int c=in.nextInt();
		
		switch (c){
		case 1:
		new Open_Code().Open_URL();
		System.out.print("\n\n\t\t\t\tYour code is open on any IDE or Notepad");
		System.out.print("\n\n\t\t\tBack To Home(Enter Any Number): ");	
	    c=in.nextInt();
	    if(c>=0)
	    new Medical().home();
		break;
		case 2:
        new Url().Open_URL();
		break;
		case 3:	
		new Medical().home();
		break;
		default:
		System.out.println("\n\t\t\t\tInvalid Choice Or Network Issue..!!!!");
	}
  }
    else if (username.equals(Username)) {
        System.out.println("\n\t\t\t\t**Invalid Password!**");
    } else if (password.equals(Password)) {
        System.out.println("\n\t\t\t\t**Invalid Username!**");
    } else {
        System.out.println("\n\t\t\t\t**Invalid Username & Password!**");
    }
	System.out.print("\n\n\t\t\tBack To Home(Enter Any Number): ");	
	    c=in.nextInt();
	    if(c>=0)
	    new Medical().home();
}
}

class FindDisease{
	Scanner in= new Scanner(System.in);
	int c,d;
	void findDisease(){
		System.out.print("\n\t\t\t\tList Of Diseases: 1: Cough\n\t\t\t\t\t\t  2: Cold\n\t\t\t\t\t\t  3: Fever\n\t\t\t\t\t\t  4: Headache\n\t\t\t\t\t\t  5: Diabetes\n\t\t\t\t\t\t  6: Liver Infection\n\t\t\t\t\t\t  7: Cancer\n\t\t\t\t\t\t  8: Heart Attack\n\t\t\t\t\t\t  9. Back To Home");
		System.out.print("\n\n\t\t\t  Enter Your Disease No.: ");
		c= in.nextInt();
		switch (c){
			case 1:
			new FindDisease().Coug();
			break;
			case 2:
			new FindDisease().Cold();
			break;
			case 3:
			new FindDisease().Fever();
			break;
			case 4:
			new FindDisease().Headache();
			break;
			case 5:
			new FindDisease().Diabetes();
			break;
			case 6:
			new FindDisease().Liver_Infection();
			break;
			case 7:
			new FindDisease().Cancer();
			break;
			case 8:
			new FindDisease().Heart_Attack();
			break;
			case 9:
			new Medical().home();
			break;
			default:
			System.out.println("\n\t\t\t\tInvalid Choice Or Network Issue..!!!!");
		}
		System.out.print("\n\n\t\t\tBack To Home(Enter Any Number): ");	
	    c=in.nextInt();
	    if(c>=0)
	    new Medical().home();	
	}	
	
    void Coug(){
	    System.out.print("\n\n\t\t\t1. Pharmacy\t\t\t\t2. Precautions\n\t\t\t3. Recommended Doctor's\t\t\t4. Back To Home");
   	    System.out.print("\n\n\t\t\t\t\tEnter Your Choice: ");
	    d= in.nextInt();
	    switch (d){
			case 1:
			new PharmacyList().Phar_Cough();
			break;
			case 2:
			new PrecautionList().Preca_Cough();
			break;
			case 3:
			new DoctorList().Doc_Cough();
			break;
			case 4:
			new Medical().home();
			break;
			default:
			System.out.println("\n\t\t\t\tInvalid Choice Or Network Issue..!!!!");
		}
		System.out.print("\n\n\t\t\tBack To Home(Enter Any Number): ");	
	    c=in.nextInt();
	    if(c>=0)
	    new Medical().home();
    }
	
	void Cold(){
	    System.out.print("\n\n\t\t\t1. Pharmacy\t\t\t\t2. Precautions\n\t\t\t3. Recommended Doctor's\t\t\t4. Back To Home");
   	    System.out.print("\n\n\t\t\t\t\tEnter Your Choice: ");
	    d= in.nextInt();
	    switch (d){
			case 1:
			new PharmacyList().Phar_Cold();
			break;
			case 2:
			new PrecautionList().Preca_Cold();
			break;
			case 3:
			new DoctorList().Doc_Cold();
			break;
			case 4:
			new Medical().home();
			break;
			default:
			System.out.println("\n\t\t\t\tInvalid Choice Or Network Issue..!!!!");
		}
		System.out.print("\n\n\t\t\tBack To Home(Enter Any Number): ");	
	    c=in.nextInt();
	    if(c>=0)
	    new Medical().home();
    }
	
	void Fever(){
	    System.out.print("\n\n\t\t\t1. Pharmacy\t\t\t\t2. Precautions\n\t\t\t3. Recommended Doctor's\t\t\t4. Back To Home");
   	    System.out.print("\n\n\t\t\t\t\tEnter Your Choice: ");
	    d= in.nextInt();
	    switch (d){
			case 1:
			new PharmacyList().Phar_Fever();
			break;
			case 2:
			new PrecautionList().Preca_Fever();
			break;
			case 3:
			new DoctorList().Doc_Fever();
			break;
			case 4:
			new Medical().home();
			break;
			default:
			System.out.println("\n\t\t\t\tInvalid Choice Or Network Issue..!!!!");
		}
		System.out.print("\n\n\t\t\tBack To Home(Enter Any Number): ");	
	    c=in.nextInt();
	    if(c>=0)
	    new Medical().home();
    }
	
	void Headache(){
	    System.out.print("\n\n\t\t\t1. Pharmacy\t\t\t\t2. Precautions\n\t\t\t3. Recommended Doctor's\t\t\t4. Back To Home");
   	    System.out.print("\n\n\t\t\t\t\tEnter Your Choice: ");
	    d= in.nextInt();
	    switch (d){
			case 1:
			new PharmacyList().Phar_Head();
			break;
			case 2:
			new PrecautionList().Preca_Head();
			break;
			case 3:
			new DoctorList().Doc_Head();
			break;
			case 4:
			new Medical().home();
			break;
			default:
			System.out.println("\n\t\t\t\tInvalid Choice Or Network Issue..!!!!");
		}
		System.out.print("\n\n\t\t\tBack To Home(Enter Any Number): ");	
	    c=in.nextInt();
	    if(c>=0)
	    new Medical().home();
    }
	
	void Diabetes(){
	    System.out.print("\n\n\t\t\t1. Pharmacy\t\t\t\t2. Precautions\n\t\t\t3. Recommended Doctor's\t\t\t4. Back To Home");
   	    System.out.print("\n\n\t\t\t\t\tEnter Your Choice: ");
	    d= in.nextInt();
	    switch (d){
			case 1:
			new PharmacyList().Phar_Diabetes();
			break;
			case 2:
			new PrecautionList().Preca_Diabetes();
			break;
			case 3:
			new DoctorList().Doc_Diabetes();
			break;
			case 4:
			new Medical().home();
			break;
			default:
			System.out.println("\n\t\t\t\tInvalid Choice Or Network Issue..!!!!");
		}
		System.out.print("\n\n\t\t\tBack To Home(Enter Any Number): ");	
	    c=in.nextInt();
	    if(c>=0)
	    new Medical().home();
    }
	
	void Liver_Infection(){
	    System.out.print("\n\n\t\t\t1. Pharmacy\t\t\t\t2. Precautions\n\t\t\t3. Recommended Doctor's\t\t\t4. Back To Home");
   	    System.out.print("\n\n\t\t\t\t\tEnter Your Choice: ");
	    d= in.nextInt();
	    switch (d){
			case 1:
			new PharmacyList().Phar_Liver();
			break;
			case 2:
			new PrecautionList().Preca_Liver();
			break;
			case 3:
			new DoctorList().Doc_Liver();
			break;
			case 4:
			new Medical().home();
			break;
			default:
			System.out.println("\n\t\t\t\tInvalid Choice Or Network Issue..!!!!");
		}
		System.out.print("\n\n\t\t\tBack To Home(Enter Any Number): ");	
	    c=in.nextInt();
	    if(c>=0)
	    new Medical().home();
    }
	
	void Cancer(){
	    System.out.print("\n\n\t\t\t1. Pharmacy\t\t\t\t2. Precautions\n\t\t\t3. Recommended Doctor's\t\t\t4. Back To Home");
   	    System.out.print("\n\n\t\t\t\t\tEnter Your Choice: ");
	    d= in.nextInt();
	    switch (d){
			case 1:
			new PharmacyList().Phar_Cancer();
			break;
			case 2:
			new PrecautionList().Preca_Cancer();
			break;
			case 3:
			new DoctorList().Doc_Cancer();
			break;
			case 4:
			new Medical().home();
			break;
			default:
			System.out.println("\n\t\t\t\tInvalid Choice Or Network Issue..!!!!");
		}
		System.out.print("\n\n\t\t\tBack To Home(Enter Any Number): ");	
	    c=in.nextInt();
	    if(c>=0)
	    new Medical().home();
    }
	
	void Heart_Attack(){
	    System.out.print("\n\n\t\t\t1. Pharmacy\t\t\t\t2. Precautions\n\t\t\t3. Recommended Doctor's\t\t\t4. Back To Home");
   	    System.out.print("\n\n\t\t\t\t\tEnter Your Choice: ");
	    d= in.nextInt();
	    switch (d){
			case 1:
			new PharmacyList().Phar_Heart();
			break;
			case 2:
			new PrecautionList().Preca_Heart();
			break;
			case 3:
			new DoctorList().Doc_Heart();
			break;
			case 4:
			new Medical().home();
			break;
			default:
			System.out.println("\n\t\t\t\tInvalid Choice Or Network Issue..!!!!");
		}
		System.out.print("\n\n\t\t\tBack To Home(Enter Any Number): ");	
	    c=in.nextInt();
	    if(c>=0)
	    new Medical().home();
    }
}

class DoctorList{
	Scanner in= new Scanner(System.in);
	int c;
    void Rec_Doc(){
		System.out.print("\n\t\t\t\tList Of Diseases: 1: Cough\n\t\t\t\t\t\t  2: Cold\n\t\t\t\t\t\t  3: Fever\n\t\t\t\t\t\t  4: Headache\n\t\t\t\t\t\t  5: Diabetes\n\t\t\t\t\t\t  6: Liver Infection\n\t\t\t\t\t\t  7: Cancer\n\t\t\t\t\t\t  8: Heart Attack\n\t\t\t\t\t\t  9. Back To Home");
		System.out.print("\n\n\t\t\t  Enter Your Disease No.: ");
		c= in.nextInt();
		switch (c){
	    case 1:
		new DoctorList().Doc_Cough();
		break;
		case 2:
		new DoctorList().Doc_Cold();
		break;
		case 3:
		new DoctorList().Doc_Fever();
		break;
		case 4:
		new DoctorList().Doc_Head();
		break;
		case 5:
		new DoctorList().Doc_Diabetes();
		break;
		case 6:
		new DoctorList().Doc_Liver();
		break;
		case 7:
		new DoctorList().Doc_Cancer();
		break;
		case 8:
		new DoctorList().Doc_Heart();
		break;
		case 9:
		new Medical().home();
		break;
		default:
		System.out.println("\n\t\t\t\tInvalid Choice Or Network Issue..!!!!");
		}
		System.out.print("\n\n\t\t\tBack To Home(Enter Any Number): ");	
	    c=in.nextInt();
	    if(c>=0)
	    new Medical().home();
	}
	
	void Doc_Cough(){
		System.out.print("\n\t\t\t\tName: Dr. Vinod Kumar Maini (MBBS, MD, Fellowship)\n\t\t\t\tTiming: 09:00 AM - 10:30 PM \n\t\t\t\tAddress: Fortis Hospital Mohali, Sector 62, Sahibzada Ajit Singh Nagar,\n\t\t\t\t\t Punjab 160062");
		System.out.print("\n\n\t\t\tBack To Home(Enter Any Number): ");	
	    c=in.nextInt();
	    if(c>=0)
	    new Medical().home();
	}
	
	void Doc_Cold(){
		System.out.print("\n\t\t\t\tName: Dr. Vinod Kumar Maini (MBBS, MD, Fellowship)\n\t\t\t\tTiming: 09:00 AM - 10:30 PM \n\t\t\t\tAddress: Fortis Hospital Mohali, Sector 62, Sahibzada Ajit Singh Nagar,\n\t\t\t\t\t Punjab 160062");
		System.out.print("\n\n\t\t\tBack To Home(Enter Any Number): ");	
	    c=in.nextInt();
	    if(c>=0)
	    new Medical().home();
	}
	
	void Doc_Fever(){
		System.out.print("\n\t\t\t\tName: Dr. PKD Shah (MBBS, MD, Fellowship)\n\t\t\t\tTiming: 11:00 AM - 01:00 PM \n\t\t\t\tAddress: Medeor Hospital, Qutab, New Delhi");
		System.out.print("\n\n\t\t\tBack To Home(Enter Any Number): ");	
	    c=in.nextInt();
	    if(c>=0)
	    new Medical().home();
	}
	
	void Doc_Head(){
		System.out.print("\n\t\t\t\tName: Dr. Aveg Bhandari (Neurologist)\n\t\t\t\tTiming: 10:00 AM - 07:00 PM \n\t\t\t\tAddress: 1A, Shri Nagar Annex, Old Palasia, Indore, Madhya Pradesh 452018");
		System.out.print("\n\n\t\t\tBack To Home(Enter Any Number): ");	
	    c=in.nextInt();
	    if(c>=0)
	    new Medical().home();
	}
	
	void Doc_Diabetes(){
		System.out.print("\n\t\t\t\tName: Dr. Kirnesh Pandey (Diabetes, Obesity, Thyroid Specialist)\n\t\t\t\tTiming: 10:30 AM - 06:30 PM \n\t\t\t\tAddress: Center for Diabetes, Thyroid, Obesity. 105 Manas\n\t\t\t\t\t Mayfair, opp. Nath Mandir, P-8, South Tukoganj,\n\t\t\t\t\t Indore, Madhya Pradesh 452001");	
		System.out.print("\n\n\t\t\tBack To Home(Enter Any Number): ");	
	    c=in.nextInt();
	    if(c>=0)
	    new Medical().home();
	}
	
	void Doc_Liver(){
		System.out.print("\n\t\t\t\tName: Dr. Amol Patil (Gastroenterologist, Liver Specialist)\n\t\t\t\tTiming: 10:00 AM - 08:00 PM \n\t\t\t\tAddress: GBL Hospital, AH/31, Senior HIG, Pandit Dindayal Upadhyayn\n\t\t\t\t\t Nagar, Near Vijay Nagar, Sukhlia, Indore, Madhya Pradesh 452010");
		System.out.print("\n\n\t\t\tBack To Home(Enter Any Number): ");	
	    c=in.nextInt();
	    if(c>=0)
	    new Medical().home();
	}
	
	void Doc_Cancer(){
		System.out.print("\n\t\t\t\tName: Dr. Naveen Sharma(Cancer Specialist)\n\t\t\t\tTiming: 08:30 AM - 07:30 PM \n\t\t\t\tAddress: 21, Panchsheel Enclave, Durgapura, Near Hotel Clarks Amer,\n\t\t\t\t\t Rajasthan 302018");
		System.out.print("\n\n\t\t\tBack To Home(Enter Any Number): ");	
	    c=in.nextInt();
	    if(c>=0)
	    new Medical().home();
	}
	
	void Doc_Heart(){
		System.out.print("\n\t\t\t\tName: Dr. R.K. Singh (Cardiologist)\n\t\t\t\tTiming: 24 Hours \n\t\t\t\tAddress: E7/81, Rd No 12, In-between 11no. (Sai Board) and 12 no.\n\t\t\t\t\t Bus Stop, opposite Indian Overseas Bank, E-7, Arera Colony,\n\t\t\t\t\t Bhopal, Madhya Pradesh 462016");
		System.out.print("\n\n\t\t\tBack To Home(Enter Any Number): ");	
	    c=in.nextInt();
	    if(c>=0)
	    new Medical().home();
	}	
}

class PrecautionList{
	Scanner in= new Scanner(System.in);
	int c;
	void Precautions(){
		System.out.print("\n\t\t\t\tList Of Diseases: 1: Cough\n\t\t\t\t\t\t  2: Cold\n\t\t\t\t\t\t  3: Fever\n\t\t\t\t\t\t  4: Headache\n\t\t\t\t\t\t  5: Diabetes\n\t\t\t\t\t\t  6: Liver Infection\n\t\t\t\t\t\t  7: Cancer\n\t\t\t\t\t\t  8: Heart Attack\n\t\t\t\t\t\t  9. Back To Home");
		System.out.print("\n\n\t\t\t  Enter Your Disease No.: ");
		c= in.nextInt();
		switch (c){
	    case 1:
		new PrecautionList().Preca_Cough();
		break;
		case 2:
		new PrecautionList().Preca_Cold();
		break;
		case 3:
		new PrecautionList().Preca_Fever();
		break;
		case 4:
		new PrecautionList().Preca_Head();
		break;
		case 5:
		new PrecautionList().Preca_Diabetes();
		break;
		case 6:
		new PrecautionList().Preca_Liver();
		break;
		case 7:
		new PrecautionList().Preca_Cancer();
		break;
		case 8:
		new PrecautionList().Preca_Heart();
		break;
		case 9:
		new Medical().home();
		break;
		default:
		System.out.println("\n\t\t\t\tInvalid Choice Or Network Issue..!!!!");
		}
		System.out.print("\n\n\t\t\tBack To Home(Enter Any Number): ");	
	    c=in.nextInt();
	    if(c>=0)
	    new Medical().home();
	}
	
	void Preca_Cough(){
		System.out.print("\n\t\t\t\t1: Cough/sneeze into a tissue or handkerchief.\n\t\t\t\t2. Wash your hands often with soap to avoid infection.\n\t\t\t\t3. Avoid touching your eyes, nose and mouth.\n\t\t\t\t4. Drink plenty of fluids and eat healthy to build immunity.\n\t\t\t\t5. Keep your distance from people to prevent spreading cold and cough.\n\t\t\t\t6: Take medicines regularly as prescribed by your doctor.\n\t\t\t\t7: Protect your body with warm clothes in winter.");
		System.out.print("\n\n\t\t\tBack To Home(Enter Any Number): ");	
	    c=in.nextInt();
	    if(c>=0)
	    new Medical().home();
	}
	
	void Preca_Cold(){
		System.out.print("\n\t\t\t\t1: Cough/sneeze into a tissue or handkerchief.\n\t\t\t\t2. Wash your hands often with soap to avoid infection.\n\t\t\t\t3. Avoid touching your eyes, nose and mouth.\n\t\t\t\t4. Drink plenty of fluids and eat healthy to build immunity.\n\t\t\t\t5. Keep your distance from people to prevent spreading cold.\n\t\t\t\t6: Take medicines regularly as prescribed by your doctor.\n\t\t\t\t7: Protect your body with warm clothes in winter.");
		System.out.print("\n\n\t\t\tBack To Home(Enter Any Number): ");	
	    c=in.nextInt();
	    if(c>=0)
	    new Medical().home();
	}
	
	void Preca_Fever(){
		System.out.print("\n\t\t\t\t1: Sit in a bath of lukewarm water, which will feel cool when you\n\t\t\t\t have a fever.\n\t\t\t\t (Cold water will actually cause your body to warm up\n\t\t\t\t instead of cool down.)\n\t\t\t\t2. Give yourself a sponge bath with lukewarm water.\n\t\t\t\t3. Wear light pajamas or clothing.\n\t\t\t\t4. Try to avoid using too many extra blankets when you have chills.\n\t\t\t\t5: Drink plenty of cool or room-temperature water.\n\t\t\t\t6: Use a fan to keep air circulating.");
		System.out.print("\n\n\t\t\tBack To Home(Enter Any Number): ");	
	    c=in.nextInt();
	    if(c>=0)
	    new Medical().home();
	}
	
	void Preca_Head(){
		System.out.print("\n\t\t\t\t1: Maintain good posture, and move around during the day.\n\t\t\t\t2. Get the right pillows.\n\t\t\t\t3. Stay consistent.\n\t\t\t\t4. Get an appropriate amount of sleep.\n\t\t\t\t5. Stick to a healthy diet and exercise regimen.\n\t\t\t\t6: Drink water.\n\t\t\t\t7: Manage stress.");
		System.out.print("\n\n\t\t\tBack To Home(Enter Any Number): ");	
	    c=in.nextInt();
	    if(c>=0)
	    new Medical().home();
	}
	
	void Preca_Diabetes(){
		System.out.print("\n\t\t\t\t1: Cut sugar and refined carbs from your diet.\n\t\t\t\t2. Work out regularly.\n\t\t\t\t3. Drink water as your primary beverage.\n\t\t\t\t4. Lose weight if you’re overweight or obese.\n\t\t\t\t5. Quit smoking.\n\t\t\t\t6: Follow a very-low-carb diet.\n\t\t\t\t7: Eat a high-fiber diet.");
		System.out.print("\n\n\t\t\tBack To Home(Enter Any Number): ");	
	    c=in.nextInt();
	    if(c>=0)
	    new Medical().home();
	}
	
	void Preca_Liver(){
		System.out.print("\n\t\t\t\t1: Maintain a healthy weight.\n\t\t\t\t2. Eat a balanced diet.\n\t\t\t\t3. Exercise regularly.\n\t\t\t\t4. Avoid toxins.\n\t\t\t\t5. Avoid the use of illicit drugs.\n\t\t\t\t6: Wash your hands.\n\t\t\t\t7: Dont share personal hygiene items.");
		System.out.print("\n\n\t\t\tBack To Home(Enter Any Number): ");	
	    c=in.nextInt();
	    if(c>=0)
	    new Medical().home();
	}
	
	void Preca_Cancer(){
		System.out.print("\n\t\t\t\t1: Dont use tobacco.\n\t\t\t\t2. Eat a healthy diet.\n\t\t\t\t3. Maintain a healthy weight and be physically active.\n\t\t\t\t4. Protect yourself from the sun.\n\t\t\t\t5. Get vaccinated.\n\t\t\t\t6: Avoid risky behaviors.\n\t\t\t\t7: Get regular medical care.");
		System.out.print("\n\n\t\t\tBack To Home(Enter Any Number): ");	
	    c=in.nextInt();
	    if(c>=0)
	    new Medical().home();
	}
	
	void Preca_Heart(){
		System.out.print("\n\t\t\t\t1: Control your blood pressure.\n\t\t\t\t2. Keep your cholesterol and triglyceride levels under control.\n\t\t\t\t3. Stay at a healthy weight.\n\t\t\t\t4. Eat a healthy diet.\n\t\t\t\t5. Dont smoke.\n\t\t\t\t6: Manage stress.\n\t\t\t\t7: Make sure that you get enough sleep.");
		System.out.print("\n\n\t\t\tBack To Home(Enter Any Number): ");	
	    c=in.nextInt();
	    if(c>=0)
	    new Medical().home();
	}
	
}

class PharmacyList{
	Scanner in= new Scanner(System.in);
	int c;
    void Pharmacy(){
		System.out.print("\n\t\t\t\tList Of Diseases: 1: Cough\n\t\t\t\t\t\t  2: Cold\n\t\t\t\t\t\t  3: Fever\n\t\t\t\t\t\t  4: Headache\n\t\t\t\t\t\t  5: Diabetes\n\t\t\t\t\t\t  6: Liver Infection\n\t\t\t\t\t\t  7: Cancer\n\t\t\t\t\t\t  8: Heart Attack\n\t\t\t\t\t\t  9. Back To Home");
		System.out.print("\n\n\t\t\t  Enter Your Disease No.: ");
		c= in.nextInt();
		switch (c){
	    case 1:
		new PharmacyList().Phar_Cough();
		break;
		case 2:
		new PharmacyList().Phar_Cold();
		break;
		case 3:
		new PharmacyList().Phar_Fever();
		break;
		case 4:
		new PharmacyList().Phar_Head();
		break;
		case 5:
		new PharmacyList().Phar_Diabetes();
		break;
		case 6:
		new PharmacyList().Phar_Liver();
		break;
		case 7:
		new PharmacyList().Phar_Cancer();
		break;
		case 8:
		new PharmacyList().Phar_Heart();
		break;
		case 9:
		new Medical().home();
		break;
		default:
		System.out.println("\n\t\t\t\tInvalid Choice Or Network Issue..!!!!");
		}
		System.out.print("\n\n\t\t\tBack To Home(Enter Any Number): ");	
	    c=in.nextInt();
	    if(c>=0)
	    new Medical().home();
	}
	
	void Phar_Cough(){
		System.out.print("\n\t\t\t\tMedicine Name: Dextromethorphan\n\t\t\t\tDetails: Dextromethorphan is a cough suppressant that affects\n\t\t\t\t\ta certain part of the brain, reducing the urge to cough.");
		System.out.print("\n\n\t\t\tBack To Home(Enter Any Number): ");	
	    c=in.nextInt();
	    if(c>=0)
	    new Medical().home();
	}
	
	void Phar_Cold(){
		System.out.print("\n\t\t\t\tMedicine Name: CROCIN COLD & FLU\n\t\t\t\tDetails: When cold and flu symptoms, Crocin Cold & Flu Max helps\n\t\t\t\t\trelieve the symptoms.");
		System.out.print("\n\n\t\t\tBack To Home(Enter Any Number): ");	
	    c=in.nextInt();
	    if(c>=0)
	    new Medical().home();
	}
	
	void Phar_Fever(){
		System.out.print("\n\t\t\t\tMedicine Name: Acetaminophen");
		System.out.print("\n\n\t\t\tBack To Home(Enter Any Number): ");	
	    c=in.nextInt();
	    if(c>=0)
	    new Medical().home();
	}
	
	void Phar_Head(){
		System.out.print("\n\t\t\t\tMedicine Name: Aspirin");
		System.out.print("\n\n\t\t\tBack To Home(Enter Any Number): ");	
	    c=in.nextInt();
	    if(c>=0)
	    new Medical().home();
	}
	
	void Phar_Diabetes(){
		System.out.print("\n\t\t\t\tMedicine Name: Metformin");	
		System.out.print("\n\n\t\t\tBack To Home(Enter Any Number): ");	
	    c=in.nextInt();
	    if(c>=0)
	    new Medical().home();
	}
	
	void Phar_Liver(){
		System.out.print("\n\t\t\t\tMedicine Name: Liver Healing Formula Powder");
		System.out.print("\n\n\t\t\tBack To Home(Enter Any Number): ");	
	    c=in.nextInt();
	    if(c>=0)
	    new Medical().home();
	}
	
	void Phar_Cancer(){
		System.out.print("\n\t\t\t\tMedicine Name: Adriamycin (chemical name: doxorubicin)");
		System.out.print("\n\n\t\t\tBack To Home(Enter Any Number): ");	
	    c=in.nextInt();
	    if(c>=0)
	    new Medical().home();
	}
	
	void Phar_Heart(){
		System.out.print("\n\t\t\t\tMedicine Name: Aspirin");
		System.out.print("\n\n\t\t\tBack To Home(Enter Any Number): ");	
	    c=in.nextInt();
	    if(c>=0)
	    new Medical().home();
	}
}


public class Medical{
	int c;
    Scanner in= new Scanner(System.in);
	
	void home(){
		System.out.println("\n*********************************************************************************************************");
		System.out.println("***************************************Welcome TO Medical Treatment**************************************");
		System.out.println("*************************************************************************************************8: Login\n");
		System.out.println(" 1:Home\t2:Find Disase\t3:Pharmacy\t4:Precautions\t5:Recommended Doctor's\t6:Customer Care\t7:About");
		System.out.println("\n   *Genuine Medicines*     *Timely Delivery*     *Easily Return*     *Refund*     *Secure*     *24x7*");
		new ChoiceList().choice();
		}

	
	void contact(){
		System.out.println("\n\t\t\tContact us:\n\n\t\t\tMail us at: medical@gmail.com\n\t\t\tCall us at: 1800 4856 8526\n\n\t\t\tAddress:\n\t\t\t5th & 6th Floor,\n\t\t\tVijay Nagar Square,\n\t\t\tIndore, Madhya Pradesh,\n\t\t\t452010");
		System.out.print("\n\n\t\t\tBack To Home(Enter Any Number): ");	
		c=in.nextInt();
		if(c>=0)
		new Medical().home();		
	}
	
	void help(){
		System.out.print("\n\t\t\t1: FAQ\n\t\t\t2: Terms and Conditions\n\t\t\t3: Privacy policy\n\t\t\t4: Back To Home\n\n\t\t\tEnter Your Choice: ");	
		c=in.nextInt();
	switch (c){
		case 1:
		System.out.print("\n\t\t\tMedical treatment is a holistic healthcare company that home delivers the\n\t\t\twidest range of medicines through booking online or over the phone.\n\t\t\tWe offer online doctor consultation and sell (OTC) wellness products\n\t\t\tincluding herbal products. You can also get lab diagnostic blood tests\n\t\t\tdone by booking for a free home collection.");
		break;
		case 2:
		System.out.print("\n\t\t\tThese terms and conditions, read with the privacy policy and wallet terms\n\t\t\tand conditions, are an electronic record under the information\n\t\t\ttechnology act, 2000, and the rules made thereunder and the amended provisions\n\t\t\tpertaining to electronic records under various Indian statutes and\n\t\t\tis enforceable against you under law by way of your acceptance hereof.\n\t\t\tMedical treatment may modify these terms and conditions and any other\n\t\t\tdocuments incorporated by reference herein at its sole discretion for\n\t\t\tcomplying with the extant legal and regulatory framework and for other\n\t\t\tlegitimate business purposes, at any time, and Medical treatment will post\n\t\t\tthe amended terms of use with or without any notification to you on the\n\t\t\tMedical treatment platform. It is your responsibility to review the terms\n\t\t\tand conditions for any changes and you are encouraged to check the terms and\n\t\t\tconditions frequently. Your use of the Medical treatment platform following any\n\t\t\tamendment of the terms and conditions will signify your assent to and\n\t\t\tacceptance of any revised terms and conditions. If you do not agree to\n\t\t\tabide by these or any future terms and conditions, please do not use or access\n\t\t\tthe Medical treatment platform.");
		break;
		case 3:
		System.out.println("\n\t\t\tThis privacy policy forms an integral part of our terms and conditions\n\t\t\t(Terms and Conditions) provided on this Website, which is included\n\t\t\therein by reference and the Terms and Conditions and this privacy policy\n\t\t\tare to be interpreted harmoniously. In addition to the terms stated in\n\t\t\tTerms and Conditions, we are committed to protecting your privacy.\n\t\t\tAuthorized representatives of Medical Treatment, on a need to know basis\n\t\t\tonly, use any information received from you or a registered medical\n\t\t\tpractitioner authorised by you. We constantly review our systems and data\n\t\t\tto secure your personal and health information.");
		break;
		case 4:	
		new Medical().home();
		break;
		default:
		System.out.println("\n\t\t\t\tInvalid Choice Or Network Issue..!!!!");
	}
	System.out.print("\n\n\t\t\tBack To Home(Enter Any Number): ");	
	c=in.nextInt();
	if(c>=0)
	new Medical().home();
}	
   
	
	public static void main(String[] args){
		new Medical().home();	
}}
