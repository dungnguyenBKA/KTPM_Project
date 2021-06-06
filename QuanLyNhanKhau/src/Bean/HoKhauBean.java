package Bean;

import java.util.ArrayList;
import java.util.List;
import models.HoKhauModel;
import models.NhanKhauModel;
import models.ThanhVienCuaHoModel;

/**
 *
 * @author Hai
 * ket noi tu nhien gia ho_khau va nhan_khau
 */

public class HoKhauBean {
    private HoKhauModel hoKhauModel;
    private NhanKhauModel chuHo;
    private List<NhanKhauModel> listNhanKhauModels;
    private List<ThanhVienCuaHoModel> listThanhVienCuaHo;

    public HoKhauBean(HoKhauModel hoKhauModel, NhanKhauModel chuHo, List<NhanKhauModel> listNhanKhauModels, List<ThanhVienCuaHoModel> listThanhVienCuaHo) {
        this.hoKhauModel = hoKhauModel;
        this.chuHo = chuHo;
        this.listNhanKhauModels = listNhanKhauModels;
        this.listThanhVienCuaHo = listThanhVienCuaHo;
    }
    
    public HoKhauBean() {
        this.hoKhauModel = new HoKhauModel();
        this.chuHo = new NhanKhauModel();
        this.listNhanKhauModels = new ArrayList<>();
        this.listThanhVienCuaHo = new ArrayList<>();
    }

    
    public HoKhauModel getHoKhauModel() {
        return hoKhauModel;
    }

    public void setHoKhauModel(HoKhauModel hoKhauModel) {
        this.hoKhauModel = hoKhauModel;
    }

    public NhanKhauModel getChuHo() {
        return chuHo;
    }

    public void setChuHo(NhanKhauModel chuHo) {
        this.chuHo = chuHo;
    }

    public List<NhanKhauModel> getListNhanKhauModels() {
        return listNhanKhauModels;
    }

    public void setListNhanKhauModels(List<NhanKhauModel> listNhanKhauModels) {
        this.listNhanKhauModels = listNhanKhauModels;
    }

    public List<ThanhVienCuaHoModel> getListThanhVienCuaHo() {
        return listThanhVienCuaHo;
    }

    public void setListThanhVienCuaHo(List<ThanhVienCuaHoModel> listThanhVienCuaHo) {
        this.listThanhVienCuaHo = listThanhVienCuaHo;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder("<html> <style>p {padding: 5px; margin-left: 20px} table, th, td {border: 1px solid black; border-collapse: collapse;} table {width: 500px}</style> <div>"
                + "<h3>Thông tin cơ bản"
                + "<p>Mã hộ khẩu: <b>" + hoKhauModel.getMaHoKhau() + "</p>"
                + "<p>Họ tên chủ hộ: <b>" + chuHo.getHoTen() + "</p>"
                + "<p>Địa chỉ: <b>" + hoKhauModel.getDiaChi() + "</p>"
                + "<p>Ngày lập: <b>" + hoKhauModel.getNgayLap().toString() + "</p>"
                + "<h4>Danh sách thành viên<table>"
                + "<tr>"
                + "<th>Họ tên</th>"
                + "<th>Ngày sinh</th>"
                + "<th>Giới tính</th>"
                + "<th>Quan hệ với chủ hộ</th>"
                + "</tr>");
        for (int i = 0; i < listNhanKhauModels.size(); i++) {
            res.append("<tr>" + "<td>").append(listNhanKhauModels.get(i).getHoTen()).append("</td>").append("<td>").append(listNhanKhauModels.get(i).getNamSinh().toString()).append("</td>").append("<td>").append(listNhanKhauModels.get(i).getGioiTinh()).append("</td>").append("<td>").append(listThanhVienCuaHo.get(i).getQuanHeVoiChuHo()).append("</td>").append("</tr>");
        }
        res.append("</table></div></html>");
        return res.toString();
    }

}
