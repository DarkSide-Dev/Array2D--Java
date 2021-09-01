
public class Main {

	public static void main(String[] args) {
		
		 String infos[][] = new String[3][3];
//		 String infos[][] = {{"Id","Name","Sex"},
//				 				{"1","Alex","Male"},
//				 				{"2","Stella","Female"}
//				 			};
		 
		 infos[0][0] = "Id";
		 infos[0][1] = "Name";
		 infos[0][2] = "Sex";
		 
		 infos[1][0] = "1";
		 infos[1][1] = "Alex";
		 infos[1][2] = "Male";
		 infos[2][0] = "2";
		 infos[2][1] = "Stella";
		 infos[2][2] = "Female";
		 
		 for(int i = 0; i < infos.length; i++) {
			 System.out.println();
			 for(int j = 0; j < infos[i].length; j++) {
				 
				 System.out.print("\t"+infos[i][j]+"\t");
				 
			 }
			 
		 }

	}

}
