import org.example.entity.BaiHat;
import org.example.service.BaiHatService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BaiHatTest {
    BaiHatService service;
    @BeforeEach
    public void setup(){
        service = new BaiHatService();
    }
    @Test
    public void testAddBaiHat(){
        int sizeGoc=service.size();
        BaiHat bh=new BaiHat("BH1","MOTCONVIT","THUY",4.5f,"NHACTRE");
        service.addBaiHat(bh);
        Assertions.assertEquals(sizeGoc+1,service.size());
    }
    @Test
    public void testAddBaiHatMin(){
        int sizeGoc=service.size();
        BaiHat bh=new BaiHat("BH2","MOTCONVIT","THUY",2f,"NHACTRE");
        service.addBaiHat(bh);
        Assertions.assertEquals(sizeGoc+1,service.size());
    }
    @Test
    public void testAddBaiHatMax(){
        int sizeGoc=service.size();
        BaiHat bh=new BaiHat("BH3","MOTCONVIT","THUY",5.59f,"NHACTRE");
        service.addBaiHat(bh);
        Assertions.assertEquals(sizeGoc+1,service.size());
    }
    @Test
    public void testAddBaiHatMinCong1(){
        int sizeGoc=service.size();
        BaiHat bh=new BaiHat("BH4","MOTCONVIT","THUY",2.1f,"NHACTRE");
        service.addBaiHat(bh);
        Assertions.assertEquals(sizeGoc+1,service.size());
    }
    @Test
    public void testAddBaiHatMaxTru1(){
        int sizeGoc=service.size();
        BaiHat bh=new BaiHat("BH5","MOTCONVIT","THUY",5.49f,"NHACTRE");
        service.addBaiHat(bh);
        Assertions.assertEquals(sizeGoc+1,service.size());
    }
    @Test
    public void testAddBaiHatMinTru1(){
        BaiHat bh=new BaiHat("BH6","MOTCONVIT","THUY",1.9f,"NHACTRE");
        Assertions.assertThrows(IllegalArgumentException.class,
                ()->service.addBaiHat(bh));
    }
}
