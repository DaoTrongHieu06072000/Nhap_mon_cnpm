/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.Color;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import jdk.nashorn.internal.objects.NativeString;
import model.DongGopModel;
import model.HoKhauModel;
import model.LanDongModel;
import model.LoaiDongGopModel;
import model.NhanKhauModel;
import model.PhiVeSinhModel;
import services.DAO.IMPL.DongGopDAO;
import services.DAO.IMPL.HoKhauDAO;
import services.DAO.IMPL.LanDongDAO;
import services.DAO.IMPL.LoaiDongGopDAO;
import services.DAO.IMPL.NhanKhauDAO;
import services.DAO.IMPL.PhiVeSinhDAO;
import services.DAO.IMPL.ThanhVienCuaHoDAO;

/**
 *
 * @author sonso
 */
public class PhiDongGop extends javax.swing.JPanel {

    ThanhVienCuaHoDAO tvchDAO = new ThanhVienCuaHoDAO();
    PhiVeSinhDAO phiVeSinhDAO = new PhiVeSinhDAO();
    HoKhauDAO hkdao = new HoKhauDAO();
    NhanKhauDAO nhanKhauDAO = new NhanKhauDAO();
    LanDongDAO lanDongDAO = new LanDongDAO();
    LoaiDongGopDAO ldgDAO = new LoaiDongGopDAO();
    String nam;
    String dot;
    String loaiDG;
    DefaultTableModel dtm = new DefaultTableModel();
    DongGopDAO phiDongGopDAO = new DongGopDAO();

    private JFrame parentFrame;

    public PhiDongGop(JFrame parentFrame) {
        this.parentFrame = parentFrame;
        initComponents();
        dtm.setRowCount(0);
        List<DongGopModel> listNam = phiDongGopDAO.findAllYear();
        for (DongGopModel p : listNam) {
            jComboBoxNam.addItem(p.getNgayDong().toString().substring(0,4));
        }
        nam = (String) jComboBoxNam.getSelectedItem();
        List<LanDongModel> listDot = lanDongDAO.findAllDot(nam);
        for (LanDongModel lanDongModel : listDot) {
            jComboBoxDot.addItem(lanDongModel.getLanThu().toString());
        }
        dot = (String) jComboBoxDot.getSelectedItem();
        List<LoaiDongGopModel> listLoaiDG = ldgDAO.findAll();
        
        for (LoaiDongGopModel loaiDongGopModel : listLoaiDG) {
            jComboBoxSK.addItem(loaiDongGopModel.getName().toString());
        }
        loaiDG = (String) jComboBoxSK.getSelectedItem();

        //setData();
    }
    
    
    public void setData() {
        int stt = 0;
        dtm = (DefaultTableModel) pdgjTable1.getModel();
        List<DongGopModel> listPdg = phiDongGopDAO.findAll(nam);
        List<LoaiDongGopModel> loaiDg = ldgDAO.findByName(loaiDG);
        List<LanDongModel> lanDongModels = lanDongDAO.findByNamAndLanThu(nam, dot);     
        //jTextField2.setText(lanDongModels.get(0).getNgayBD().toString());
        //jTextField3.setText(lanDongModels.get(0).getNgayKT().toString());
        for (DongGopModel phiDongGopModel : listPdg) {
            for (LoaiDongGopModel loaiDongGop: loaiDg) {
                if (phiDongGopModel.getIdLoaiDonggop().toString().equals(loaiDongGop.getIdLoaiDongGop().toString())) {
                    for (LanDongModel lanDongModel : lanDongModels) {
                       if (phiDongGopModel.getIdLanDong().toString().equals(lanDongModel.getIdLanDong().toString())) {
                            HoKhauModel a = hkdao.findByIdHoKhau(phiDongGopModel.getIdHoKhau());
                            NhanKhauModel b = nhanKhauDAO.findById(a.getIdChuHo());
                            dtm.addRow(new Object[]{++stt, a.getMaHoKhau(), b.getHoTen(), phiDongGopModel.getSoTien()});
                    } 
                    }
                    
                }
            }
           
        }
//        jLabel9.setText("");
//        jLabel10.setText("");
//        jLabel12.setText("");
//        jLabel8.setText("");
//        jLabel7.setText("");
//        jTextField2.setText("");
//        trangthai.setText("Trạng thái");
//        trangthai.setBackground(Color.white);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldBD = new javax.swing.JTextField();
        jTextFieldKT = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxDot = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxNam = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jComboBoxSK = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pdgjTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        SearchjButton1 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        OKjButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 102));
        setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Quản Lý Phí Đóng Góp", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        setPreferredSize(new java.awt.Dimension(703, 542));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Sự kiện:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Thời gian diễn ra:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Từ:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Đến:");

        jTextFieldBD.setEditable(false);
        jTextFieldBD.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldBD.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldKT.setEditable(false);
        jTextFieldKT.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldKT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Đợt số:");

        jComboBoxDot.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBoxDot.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxDotItemStateChanged(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Năm:");

        jComboBoxNam.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBoxNam.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxNamItemStateChanged(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Số Hộ ủng hộ:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Số Tiền Ủng Hộ Đợt Này:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("5/12 hộ");
        jLabel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setPreferredSize(new java.awt.Dimension(5, 2));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jComboBoxSK.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jComboBoxSK.setForeground(new java.awt.Color(255, 51, 0));
        jComboBoxSK.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxSKItemStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Danh sách các hộ gia đình ủng hộ:");

        pdgjTable1.setBackground(new java.awt.Color(255, 255, 204));
        pdgjTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "STT", "Mã Hộ Khẩu", "Tên chủ hộ", "Số tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(pdgjTable1);

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Tên C/Hộ:");

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 0, 0));
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        SearchjButton1.setBackground(new java.awt.Color(255, 153, 0));
        SearchjButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        SearchjButton1.setText("Tìm kiếm");
        SearchjButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SearchjButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SearchjButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SearchjButton1MouseExited(evt);
            }
        });
        SearchjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchjButton1ActionPerformed(evt);
            }
        });

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 0, 0));
        jTextField4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Số tiền:");

        OKjButton2.setBackground(new java.awt.Color(255, 153, 0));
        OKjButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        OKjButton2.setText("OK");
        OKjButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        OKjButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                OKjButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                OKjButton2MouseExited(evt);
            }
        });
        OKjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKjButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SearchjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(OKjButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(OKjButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SearchjButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(16, 16, 16))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel2.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("13.000.000 ");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(1, 0, 240, 80);

        jLabel14.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 51));
        jLabel14.setText("VNĐ");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(150, 60, 90, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxSK, 0, 293, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboBoxNam, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxDot, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(29, 29, 29)
                                .addComponent(jTextFieldKT, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldBD, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jComboBoxNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jComboBoxSK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jComboBoxDot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldBD, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldKT, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SearchjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchjButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchjButton1ActionPerformed

    private void OKjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKjButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OKjButton2ActionPerformed

    private void SearchjButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchjButton1MouseEntered
        // TODO add your handling code here:
        SearchjButton1.setBackground(new Color(0, 255, 204));
    }//GEN-LAST:event_SearchjButton1MouseEntered

    private void SearchjButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchjButton1MouseExited
        // TODO add your handling code here:
        SearchjButton1.setBackground(new Color(255, 153, 0));
    }//GEN-LAST:event_SearchjButton1MouseExited

    private void OKjButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OKjButton2MouseEntered
        // TODO add your handling code here:
        OKjButton2.setBackground(new Color(0, 255, 204));
    }//GEN-LAST:event_OKjButton2MouseEntered

    private void OKjButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OKjButton2MouseExited
        // TODO add your handling code here:
        OKjButton2.setBackground(new Color(255, 153, 0));
    }//GEN-LAST:event_OKjButton2MouseExited

    private void jComboBoxNamItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxNamItemStateChanged
        dtm.setRowCount(0);
        nam = (String) jComboBoxNam.getSelectedItem();
        //dot = (String) jComboBox1.getSelectedItem();
        dot = "1";
        jTextFieldBD.setText(lanDongDAO.findByNamAndLanThu(nam, dot).get(0).getNgayBD().toString());
        jTextFieldKT.setText(lanDongDAO.findByNamAndLanThu(nam, dot).get(0).getNgayKT().toString());
        setData();
    }//GEN-LAST:event_jComboBoxNamItemStateChanged

    private void jComboBoxSKItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxSKItemStateChanged
        dtm.setRowCount(0);
        loaiDG = (String) jComboBoxSK.getSelectedItem();
        setData();
    }//GEN-LAST:event_jComboBoxSKItemStateChanged

    private void jComboBoxDotItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxDotItemStateChanged
        dtm.setRowCount(0);
        nam = "2020";
        dot = (String) jComboBoxDot.getSelectedItem();
        jTextFieldBD.setText(lanDongDAO.findByNamAndLanThu(nam, dot).get(0).getNgayBD().toString());
        jTextFieldKT.setText(lanDongDAO.findByNamAndLanThu(nam, dot).get(0).getNgayKT().toString());
        setData();
    }//GEN-LAST:event_jComboBoxDotItemStateChanged

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OKjButton2;
    private javax.swing.JButton SearchjButton1;
    private javax.swing.JComboBox<String> jComboBoxDot;
    private javax.swing.JComboBox<String> jComboBoxNam;
    private javax.swing.JComboBox<String> jComboBoxSK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextFieldBD;
    private javax.swing.JTextField jTextFieldKT;
    private javax.swing.JTable pdgjTable1;
    // End of variables declaration//GEN-END:variables
}
