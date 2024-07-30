package ObserverPatternExample;

public class ObserverPatternTest {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp1 = new MobileApp("MobileApp1");
        Observer mobileApp2 = new MobileApp("MobileApp2");
        Observer webApp = new WebApp("WebApp1");
   
        
        stockMarket.registerObserver(mobileApp1);
        stockMarket.registerObserver(mobileApp2);
        stockMarket.registerObserver(webApp);
        System.out.println();

        stockMarket.setStockPrice(1000);
        stockMarket.setStockPrice(1500);
        System.out.println();

        stockMarket.deregisterObserver(mobileApp2);
        stockMarket.setStockPrice(2000);
    }
}
