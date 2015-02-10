package JDBC;
import java.sql.*;
public class Test1 {
 private static Connection con;
 private static Statement stmt;
 private static ResultSet rs;
 
 public static void main(String[] ar){
  try{
   // 1. Driver를 로딩한다.
   Class.forName("oracle.jdbc.driver.OracleDriver");
   System.out.println("OracleDriver의 로딩이 정상적으로 이뤄졌습니다.");
   
   // 2. Connection 얻어오기
   con = DriverManager.getConnection("jdbc:oracle:thin:@아이피주소:1521:orcl", "user_154", "oracle");
   System.out.println("데이터베이스의 연결에 성공하였습니다.");
   
   // 3. Statement 얻기 --> 쿼리문 작성하여 적용하기 위한 용도
   stmt = con.createStatement();
   
   // 4. 쿼리문 실행 -->> insert into (자동으로 commit 됩니다.)
   String sql= "insert into test values(2,'철이','10','경기도')";
   stmt.executeUpdate(sql);
  
   // 5. 업데이트  -->> update 합니다.  (자동으로 commit 됩니다.)
   sql = "update test set addr='별나라'" + "where name='순이'";
   stmt.executeUpdate(sql);
   
   // 6. Delete 삭제  -->> delete 합니다. (자동으로 commit 됩니다.)
   sql = "delete from test where name='똘이장군'";
   stmt.executeUpdate(sql);
   
   // 7. Select문 실행하여 데이터베이스 내용 출력하기
   sql = "select * from test";
   rs = stmt.executeQuery(sql);
   while(rs.next()){
    System.out.println("이름 : " + rs.getString("name") + "\t나이 : " + rs.getString(3) + "\t주소 : " + rs.getString("addr"));
   }
   rs.close();
   stmt.close();
   con.close();
  }catch(ClassNotFoundException cnfe){
   System.out.println("oracle.jdbc.driver.OracleDriver를 찾을 수 없습니다.");
  }catch(SQLException  sql){
   System.out.println("Connection 실패!");
  }catch(Exception e){
   System.out.println(e.toString());
  }finally{
   System.out.println("성공!!");
  }
 }
}


/*

     위의 소스는 데이터베이스에 접근하여 데이터의 추가, 변경, 삭제, 검색을 간단히 해보는 예제이다.

     이때, 주의할 점은 오라클 SQL*Plus로 테이블을 만들었을 경우 commit 을 해주지 않으면 이클립스에서

     해당 테이블을 찾지못해 Exception을 던진다. 그러므로 오라클 SQL*Plus로 테이블을 작성할 시 반드시 commit을 해주길 바란다.

*/ 