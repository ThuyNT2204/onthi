import org.example.service.XepLoai;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class XepLoaiTest {
    XepLoai xepLoai = new XepLoai();
    @Test
    public void xepLoaiTest1() {
        String mongMuon="xuat sac";
        String thucTe=xepLoai.xepLoai(9.5);
        Assertions.assertEquals(mongMuon,thucTe);
    }
    @Test
    public void xepLoaiTest2() {
        String mongMuon="gioi";
        String thucTe=xepLoai.xepLoai(8);
        Assertions.assertEquals(mongMuon,thucTe);
    }
    @Test
    public void xepLoaiTest3() {
        String mongMuon="trung binh";
        String thucTe=xepLoai.xepLoai(6);
        Assertions.assertEquals(mongMuon,thucTe);
    }
    @Test
    public void xepLoaiTest4() {
        String mongMuon="yeu";
        String thucTe=xepLoai.xepLoai(3);
        Assertions.assertEquals(mongMuon,thucTe);
    }
    @Test
    public void xepLoaiTestBien5() {
        String mongMuon="xuat sac";
        String thucTe=xepLoai.xepLoai(9);
        Assertions.assertEquals(mongMuon,thucTe);
    }
    @Test
    public void xepLoaiTestBienMaxCong1() {
        Assertions.assertThrows(IllegalArgumentException.class,
                ()->xepLoai.xepLoai(11));
    }
    @Test
    public void xepLoaiTestBienMinTru1() {
        Assertions.assertThrows(IllegalArgumentException.class,
                ()->xepLoai.xepLoai(-1));
    }


}
