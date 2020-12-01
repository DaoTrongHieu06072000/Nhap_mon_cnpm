/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.Color;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.HoKhauModel;
import model.NhanKhauModel;
import model.PhiVeSinhModel;
import services.DAO.IMPL.HoKhauDAO;
import services.DAO.IMPL.NhanKhauDAO;
import services.DAO.IMPL.PhiVeSinhDAO;

/**
 *
 * @author sonso
 */
public class PhiVS extends javax.swing.JPanel {

    PhiVeSinhDAO phiVeSinhDAO = new PhiVeSinhDAO();
    HoKhauDAO hkdao = new HoKhauDAO();
    NhanKhauDAO nhanKhauDAO = new NhanKhauDAO();
    String nam;
    DefaultTableModel dtm = new DefaultTableModel();

    private JFrame parentFrame;

    public PhiVS(JFrame parentFrame) {
        dtm.setRowCount(0);
        this.parentFrame = parentFrame;
        initComponents();
        List<PhiVeSinhModel> listNam = phiVeSinhDAO.getAllYear();
        for (PhiVeSinhModel p : listNam) {
            jComboBox1.addItem(p.getNam().toString());
        }
        nam = (String) jComboBox1.getSelectedItem();

        //setData();
    }

    public void setData() {

        dtm = (DefaultTableModel) pvsjTable1.getModel();
        List<PhiVeSinhModel> listPsv = phiVeSinhDAO.findByYear(nam);
        for (PhiVeSinhModel phiVeSinhModel : listPsv) {

            HoKhauModel a = hkdao.findByIdHoKhau(phiVeSinhModel.getIdHoKhau());
            NhanKhauModel b = nhanKhauDAO.findById(a.getIdChuHo());
            dtm.addRow(new Object[]{phiVeSinhModel.getIdPhiVeSinh(), a.getMaHoKhau(), b.getHoTen(), phiVeSinhModel.getSoNhanKhau(), phiVeSinhModel.getDaThu()});
        }
        jLabel9.setText("");
        jLabel10.setText("");
        jLabel12.setText("");
        jLabel8.setText("");
        jLabel7.setText("");
        jTextField2.setText("");
        trangthai.setText("Trạng thái");
        trangthai.setBackground(Color.white);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pvsjTable1 = new javax.swing.JTable();
        AddnewDSjButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        searchjButton3 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        trangthai = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 102));
        setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Quản Lý Phí Vệ Sinh", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        setPreferredSize(new java.awt.Dimension(703, 542));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox1.setMaximumRowCount(5);
        jComboBox1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jComboBox1.setName("Năm"); // NOI18N
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Năm:");

        pvsjTable1.setBackground(new java.awt.Color(255, 255, 204));
        pvsjTable1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        pvsjTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã", "Mã Hộ Khẩu", "Tên chủ hộ", "Số Người", "Đã Thu"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        pvsjTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pvsjTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(pvsjTable1);
        if (pvsjTable1.getColumnModel().getColumnCount() > 0) {
            pvsjTable1.getColumnModel().getColumn(0).setMinWidth(45);
            pvsjTable1.getColumnModel().getColumn(0).setPreferredWidth(45);
            pvsjTable1.getColumnModel().getColumn(0).setMaxWidth(45);
            pvsjTable1.getColumnModel().getColumn(2).setMinWidth(130);
            pvsjTable1.getColumnModel().getColumn(2).setPreferredWidth(130);
            pvsjTable1.getColumnModel().getColumn(2).setMaxWidth(130);
            pvsjTable1.getColumnModel().getColumn(3).setMinWidth(55);
            pvsjTable1.getColumnModel().getColumn(3).setPreferredWidth(55);
            pvsjTable1.getColumnModel().getColumn(3).setMaxWidth(55);
        }

        AddnewDSjButton1.setBackground(new java.awt.Color(255, 153, 0));
        AddnewDSjButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AddnewDSjButton1.setText("Tạo danh sách mới");
        AddnewDSjButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        AddnewDSjButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddnewDSjButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddnewDSjButton1MouseExited(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Mã Hộ Khẩu:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Tên Chủ Hộ:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Số Nhân Khẩu:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Số tiền thu:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Chi Tiết");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("24.000 vnd");
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel8.setText("4 người");

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel9.setText("KSJDLKVCVC");

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel10.setText("Tô Hoài Sơn");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("PhíVS/NK/1năm: ");

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel12.setText("72,000đ/ng");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(92, 92, 92))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel10))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextField1.setPreferredSize(new java.awt.Dimension(8, 28));

        searchjButton3.setBackground(new java.awt.Color(255, 153, 0));
        searchjButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        searchjButton3.setText("Tìm kiếm");
        searchjButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        searchjButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchjButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchjButton3MouseExited(evt);
            }
        });
        searchjButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchjButton3ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Hộ Khẩu:");

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        trangthai.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        trangthai.setText("Trạng thái");
        trangthai.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        trangthai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trangthaiActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel14.setText("* Nhập tên chủ hộ cần tìm kiếm!");

        jButton1.setBackground(new java.awt.Color(255, 153, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Refresh");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(trangthai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchjButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addComponent(AddnewDSjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchjButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddnewDSjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trangthai, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AddnewDSjButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddnewDSjButton1MouseEntered
        // TODO add your handling code here:

        AddnewDSjButton1.setBackground(new Color(0, 255, 204));
    }//GEN-LAST:event_AddnewDSjButton1MouseEntered

    private void AddnewDSjButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddnewDSjButton1MouseExited
        // TODO add your handling code here:
        AddnewDSjButton1.setBackground(new Color(255, 153, 0));
    }//GEN-LAST:event_AddnewDSjButton1MouseExited

    private void searchjButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchjButton3MouseEntered
        // TODO add your handling code here:
        searchjButton3.setBackground(new Color(0, 255, 204));
    }//GEN-LAST:event_searchjButton3MouseEntered

    private void searchjButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchjButton3MouseExited
        // TODO add your handling code here:
        searchjButton3.setBackground(new Color(255, 153, 0));
    }//GEN-LAST:event_searchjButton3MouseExited

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
        dtm.setRowCount(0);
        nam = (String) jComboBox1.getSelectedItem();
        setData();
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void pvsjTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pvsjTable1MouseClicked
        // TODO add your handling code here:
        //set gia tri cho cai o duoi
        jLabel12.setText("72,000 vnđ");
        int row = pvsjTable1.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(PhiVS.this, "Chọn một dòng để xem thông tin");
        } else {

            String MaHK = String.valueOf(pvsjTable1.getValueAt(row, 1));
            int daThu = (Integer) pvsjTable1.getValueAt(row, 4);
            jTextField2.setText("    " + MaHK);
            if (daThu == 0) {
                trangthai.setText("Chưa thu");
                trangthai.setBackground(Color.red);

            } else if (daThu == 1) {
                trangthai.setText("Đã thu");

                trangthai.setBackground(Color.green);
            }

            //chi tiet
            jLabel9.setText(String.valueOf(pvsjTable1.getValueAt(row, 1)));
            jLabel10.setText(String.valueOf(pvsjTable1.getValueAt(row, 2)));
            String aaa = String.valueOf(pvsjTable1.getValueAt(row, 3));
            jLabel8.setText(aaa + "  người");
            String snguoi[] = aaa.split(" ");
            jLabel7.setText(String.format("%,.0f", (double) Integer.valueOf(snguoi[0]) * 72000) + " vnd");
        }


    }//GEN-LAST:event_pvsjTable1MouseClicked

    private void trangthaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trangthaiActionPerformed
        // TODO add your handling code here:
        if (trangthai.getText().equals("Chưa thu")) {
            if (JOptionPane.showConfirmDialog(null, "Xác Nhận Thu Tiền?", "Xác Nhận Thu Tiền", JOptionPane.YES_NO_OPTION) == 0) {
                trangthai.setText("Đã thu");
                trangthai.setBackground(Color.green);
                int row = pvsjTable1.getSelectedRow();
                String IDphivs = String.valueOf(pvsjTable1.getValueAt(row, 0));
                PhiVeSinhModel pvsm = phiVeSinhDAO.findById(IDphivs);
                pvsm.setDaThu(1);
                phiVeSinhDAO.update(pvsm);
                JOptionPane.showMessageDialog(PhiVS.this, "Thu thành công!");
                dtm.setRowCount(0);
                nam = (String) jComboBox1.getSelectedItem();
                setData();
            }
        } else {
            JOptionPane.showMessageDialog(PhiVS.this, "Hộ Đã Thu!", "Thông báo" , 1);
        }
    }//GEN-LAST:event_trangthaiActionPerformed

    private void searchjButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchjButton3ActionPerformed
        // TODO add your handling code here:
        //jLabel14.setForeground(new Color(0, 255, 204));
        String ten = jTextField1.getText().toLowerCase();
        if (ten.equals("")) {
            dtm.setRowCount(0);
            jLabel14.setText("* Nhập tên chủ hộ cần tìm kiếm!");
            setData();
        }
        int row = pvsjTable1.getRowCount();
        if (row > 0) {
            for (int i = 0; i < row; i++) {
                jLabel14.setForeground(Color.BLACK);
                jLabel14.setText("* Nhập tên chủ hộ cần tìm kiếm!");
                String hoten = String.valueOf(pvsjTable1.getValueAt(i, 2)).toLowerCase();
                if (hoten.equalsIgnoreCase(ten)) {
                    String a1 = String.valueOf(pvsjTable1.getValueAt(i, 0));
                    String a2 = String.valueOf(pvsjTable1.getValueAt(i, 1));
                    String a3 = String.valueOf(pvsjTable1.getValueAt(i, 2));
                    String a4 = String.valueOf(pvsjTable1.getValueAt(i, 3));
                    int a5 = (Integer) pvsjTable1.getValueAt(i, 4);;
                    dtm.setRowCount(0);
                    dtm.addRow(new Object[]{a1, a2, a3, a4, a5});
                    break;
                } else {
                    //dtm.setRowCount(0);
                    jLabel14.setText("* Không có kết quả tương ứng!");
                    jLabel14.setForeground(Color.RED);
                }
            }
        } else {
            setData();
        }
    }//GEN-LAST:event_searchjButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dtm.setRowCount(0);
        setData();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
        jButton1.setBackground(new Color(0, 255, 204));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
        jButton1.setBackground(new Color(255, 153, 0));
    }//GEN-LAST:event_jButton1MouseExited

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddnewDSjButton1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable pvsjTable1;
    private javax.swing.JButton searchjButton3;
    private javax.swing.JButton trangthai;
    // End of variables declaration//GEN-END:variables
}
