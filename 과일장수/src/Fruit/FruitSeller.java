package Fruit;

// �ֿ������ �ۼ��Ͻ� ������� �ڵ�        �޼ҵ� ���
public class FruitSeller {
	int APPLE_PRICE=1000;
    int myMoney= 50000;
    int numOfApple=20;
    
    public int saleApple(int money) {
       int num = money/APPLE_PRICE;
       numOfApple -=num;
       myMoney += money;
       return num;
    }
       public void showSaleResult() {
      System.out.println("���� ���:"+numOfApple);
      System.out.println("��:"+myMoney);
      
   }
    }
class FruitBuyer{
   int myMoney=5000;
   int numOfApple=0;
   
   public void buyApple(FruitSeller seller, int money) {
      numOfApple += seller.saleApple(money);
      myMoney-=money;
   }
   public void showSaleResult() {
      System.out.println("���� ���:"+numOfApple);
      System.out.println("��:"+myMoney);
}
}
class FruitSales{
   public static void main(String[] args) {
      FruitSeller seller = new FruitSeller();
      FruitBuyer buyer = new FruitBuyer();
      buyer.buyApple(seller,2000);

      seller.showSaleResult();
      buyer.showSaleResult();
   }
}



