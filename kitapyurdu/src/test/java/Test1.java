import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Test1 {
    Kitapyurdu kitapyurdu;
    CardPage cardPage;
    @Test
    public void Checkhomepage(){
        kitapyurdu.CheckHomepage();
    }
    @Test
    public void search(){
        kitapyurdu.search("roman");
        kitapyurdu.selectitem();
        Assertions.assertTrue(kitapyurdu.isonItemDetailPage());
    }

    @Test
    public void  add_to_card(){
        kitapyurdu.addtoCard();
        Assertions.assertTrue(kitapyurdu.checktheItemNumber());
    }

    @Test
    public void go_to_card(){
        kitapyurdu.gotoCard();
        Assertions.assertTrue(cardPage.checktheCardPage());
    }








}