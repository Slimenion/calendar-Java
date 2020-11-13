public class Data {
  int d,m,y;
  int[] monthConst;
  Data(int d, int m, int y) throws MyException {
      int february;
      if (y * d * m > 0 || m <= 12 || d <= 31) {
          if (y % 4 == 0) {
              if (y%100==0) {
                  if (y%400==0) {
                      february = 29;
                  }
                  else {
                      february = 28;
                  }
              }
              else {
                  february = 29;
              }
          } else {
              february = 28;
          }
          monthConst = new int[]{0, 31, february, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
      }
      else {
          throw new MyException("Некорректная дата", d, m, y);
      }
      if (monthConst[m] >= d) {
          this.d = d;
          this.m = m;
          this.y = y;
      } else {
          throw new MyException("Некорректная дата", d, m, y);
      }
  }

  void print(){
      System.out.println(m+"."+d+"."+y);
  }
  void plusDate(int n) {
      while(n>0){
              if(d==monthConst[m]){
                  n--;
                  d=1;
                  if(m<12){
                      m++;
                  }
                  else{
                      y++;
                      m=1;
                      int february;
                      if (y % 4 == 0) {
                          if (y%100==0) {
                              if (y%400==0) {
                                  february = 29;
                              }
                              else {
                                  february = 28;
                              }
                          }
                          else {
                              february = 29;
                          }
                      } else {
                          february = 28;
                      }
                      monthConst[2]=february;
                  }
              }
              else {
                  n--;
                  d++;
              }
      }

      System.out.println("Новая дата: "+d+"."+m+"."+y+".");
  }
}
