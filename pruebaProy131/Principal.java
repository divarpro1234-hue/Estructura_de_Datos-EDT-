import java.util.Iterator;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ColaCircularMateria cm1 = new ColaCircularMateria();
		cm1.adi(new Materia("calculo", "00101"));
		cm1.adi(new Materia("calculo", "00101"));
		cm1.adi(new Materia("calculo", "00101"));
		cm1.adi(new Materia("calculo", "00101"));
		
		ColaCircularMateria cm2 = new ColaCircularMateria();
		cm2.adi(new Materia("calculo", "00101"));
		cm2.adi(new Materia("calculo", "00101"));
		cm2.adi(new Materia("calculo", "00101"));
		cm2.adi(new Materia("calculo", "00101"));
		
		ColaSimpleEst ce1 = new ColaSimpleEst();
		ce1.adi(new Estudiante("jjj", "123485", 20, "03/01/1999", "mujer", 70, cm1));
		ce1.adi(new Estudiante("jjj", "123485", 20, "03/01/1999", "mujer", 70, cm2));
		
		PilaEqui pe1 = new PilaEqui();
		pe1.adi(new Equipamiento("mesa", "madera", 40, 5));
		pe1.adi(new Equipamiento("mesa", "madera", 40, 5));
		pe1.adi(new Equipamiento("mesa", "madera", 40, 5));
		
		Materia m1 = new Materia("algebra", "00123");
		Docente d1 = new Docente("qqq", "12365", "matematica");
		
		Materia m2 = new Materia("algebra", "00123");
		Docente d2 = new Docente("qqq", "12365", "matematica");
		
		LS_NormalHorario lh1 = new LS_NormalHorario();
		lh1.adiFinal(new Horario("lunes", "12:00", "02:00", d1, m1));
		lh1.adiFinal(new Horario("lunes", "12:00", "02:00", d2, m2));
		
		ColaSimpleAula ca1 = new ColaSimpleAula();
		ca1.adi(new Aula("0012", 60, "grande", pe1, ce1, lh1));
		
		ca1.mostrar();
		
		LS_CircularDoc lcd1 = new LS_CircularDoc();
		lcd1.adiFinal(new Docente("fff", "000655", "calculo"));
		lcd1.adiFinal(new Docente("fff", "000655", "calculo"));
		lcd1.adiFinal(new Docente("fff", "000655", "calculo"));
		lcd1.adiFinal(new Docente("fff", "000655", "calculo"));
		
		
		System.out.println("\n\tSISTEMA DE ESTUDIANTES");
		Sistema A = new Sistema(ca1, lcd1, ce1);
		A.mostrar();
	}

}
