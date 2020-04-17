class Main {
  public static void main(String[] args) {
    
    //구구단 8 단 1000단 부터 -500단 까지
    int i = 1;
    int x = 8;

    while(i <= 1000){
      System.out.println(x * i);
      i++;

    }

    i = 0;

    while(i >= -500){
      System.out.println(x * i);
      i--;
    }


    //1 부터 5까지 더하기
    i = 1;
    int sum = 0;
    while ( i <= 5){
      sum += i;
      i++;
    }
    System.out.println(sum);
  }
}
//해냈다! 복습완료