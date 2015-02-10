import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SampleException{
	public static void main(String[] args){

			double a , b, result;
		BufferedReader br = null;

		try{
			br  = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("a =");
			a = Double.parseDouble(br.readLine());

			System.out.print("b =");

			b = Double.parseDouble(br.readLine());

			result = a/b;

			System.out.println("a / b = " + (double)a/b);
		} catch(ArithmeticException e){
				e.printStackTrace(PrintStream s);
				System.out.println("ZERO には　われません！！！");
		}catch(IOException e){
				e.printStackTrace(PrintStream s);
			System.out.println("IO ERROR");
		}catch(NumberFormatException e){
				e.printStackTrace(PrintStream s);
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("あなたは大変エラーを生じさせました。");
		}
		finally{
			System.out.println("**************** 終わりました!!!!!!!!!!!!!!!");
			try{
				if (br != null){
					br.close();
				}
			}catch (IOException e) {
				e.printStackTrace(PrintStream s);
				System.out.println("stream NO ERROR ... TABUN");				
			}
		}

	}
}