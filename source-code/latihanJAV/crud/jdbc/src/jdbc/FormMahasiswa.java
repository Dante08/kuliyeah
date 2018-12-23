/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

/**
 *
 * @author adm
 */import java.awt.event.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class FormMahasiswa extends JFrame {
private String [] judul = {"NPM", "Nama",
"Alamat"}; DefaultTableModel df;
JTable tab = new JTable();
JScrollPane scp = new JScrollPane();
JPanel pnl = new JPanel();
JLabel lblnama=new JLabel("Nama");
JTextField txnama=new JTextField(20);
JLabel lblnpm=new JLabel("NPM");
JTextField txnpm=new JTextField(7);
JLabel lblalamat = new JLabel("Alamat");
JTextArea alamat = new JTextArea();
JScrollPane sca = new JScrollPane(alamat);
JButton btadd = new JButton("Simpan");
JButton btnew = new JButton("Baru");
JButton btdel = new JButton("Hapus");
JButton btubh = new JButton("Ubah");
FormMahasiswa() {
super("Data Mahasiswa");
setSize(460, 300);
pnl.setLayout(null);
pnl.add(lblnpm);
lblnpm.setBounds(20, 10, 80, 20);
pnl.add(txnpm);
txnpm.setBounds(105,10,100,20);
pnl.add(lblnama);
lblnama.setBounds(20, 33, 80, 20);
pnl.add(txnama);
txnama.setBounds(105,33,175,20);
pnl.add(lblalamat);
lblalamat.setBounds(20, 56, 80, 20);
pnl.add(sca);
sca.setBounds(105, 56, 175, 45);
pnl.add(btnew);
btnew.setBounds(300, 10, 125, 20);
btnew.addActionListener(new ActionListener()
{ @Override
public void actionPerformed(ActionEvent e) {
btnewAksi(e);
}
});
pnl.add(btadd);
btadd.setBounds(300, 33, 125, 20);
btadd.addActionListener(new ActionListener()
{ @Override
public void actionPerformed(ActionEvent e)
{ btaddAksi(e);
}
});
pnl.add(btubh);
btubh.setBounds(300, 56, 125, 20);
btubh.setEnabled(false);
btubh.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e)
{ btubhAksi(e);
}
});
pnl.add(btdel);
btdel.setBounds(300, 79, 125, 20);
btdel.setEnabled(false);
btdel.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e)
{ btdelAksi(e);
}
});
df = new DefaultTableModel(null, judul);
tab.setModel(df);
scp.getViewport().add(tab);
tab.setEnabled(true);
tab.addMouseListener(new MouseAdapter() {
public void mouseClicked(MouseEvent evt)
{ tabMouseClicked(evt);
}
});
scp.setBounds(20, 110, 405, 130);
pnl.add(scp);
getContentPane().add(pnl);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
void loadData() {
try{
Connection cn = new
connectDB().getConnect(); Statement st =
cn.createStatement(); String sql = "SELECT * FROM Mahasiswa"; ResultSet rs =
st.executeQuery(sql); while(rs.next()) {
String npm, nama, alamat;
npm = rs.getString("NIM");
nama = rs.getString("Nama");
alamat = rs.getString("Alamat");
String [] data = {npm, nama, alamat};
df.addRow(data);
}
rs.close();
cn.close();
} catch (SQLException ex) {
ex.printStackTrace();
}
}
void clearTable() {
int numRow = df.getRowCount();
for(int i=0; i<numRow; i++) {
df.removeRow(0);
}
}
void clearTextField() {
txnpm.setText(null);
txnama.setText(null);
alamat.setText(null);
}
void simpanData(Mahasiswa M) {
try{
Connection cn = new connectDB().getConnect();
Statement st = cn.createStatement();
String sql = "INSERT INTO Mahasiswa (NIM, Nama, Alamat) "
+ "VALUES ('" + M.getNpm() + "', '" + M.getNama()
+ "', '" + M.getAlamat() +"')";
int result = st.executeUpdate(sql);
cn.close();
JOptionPane.showMessageDialog(null, "Data berhasil disimpan",
"Info Proses", JOptionPane.INFORMATION_MESSAGE);
String [] data = {M.getNpm(), M.getNama(),
M.getAlamat()}; df.addRow(data);
} catch (SQLException ex) {
ex.printStackTrace();
}
}
void hapusData(String npm) {
try{
Connection cn = new connectDB().getConnect();
Statement st = cn.createStatement();
String sql = "DELETE FROM Mahasiswa WHERE NIM ='"+npm+"'"; int result = st.executeUpdate(sql);
cn.close();
JOptionPane.showMessageDialog(null, "Data berhasil dihapus",
"Info Proses", JOptionPane.INFORMATION_MESSAGE);
df.removeRow(tab.getSelectedRow());
clearTextField();
} catch (SQLException ex) {
ex.printStackTrace();
}
}
void ubahData(Mahasiswa M, String npm)
{ try{
Connection cn = new connectDB().getConnect();
Statement st = cn.createStatement();
String sql = "UPDATE Mahasiswa SET NIM='" + M.getNpm()
+ "', Nama ='" + M.getNama() + "', Alamat='" +
M.getAlamat() +"' WHERE NIM='" + npm + "'";
int result = st.executeUpdate(sql);
cn.close();
JOptionPane.showMessageDialog(null, "Data berhasil diubah", "Info Proses", JOptionPane.INFORMATION_MESSAGE);
clearTable();
loadData();
} catch (SQLException ex) {
ex.printStackTrace();
}
}
private void btnewAksi(ActionEvent evt) {
txnpm.setText(null);
txnama.setText(null);
alamat.setText(null);
btubh.setEnabled(false);
btdel.setEnabled(false);
btadd.setEnabled(true);
}
private void btaddAksi(ActionEvent evt)
{ Mahasiswa M = new Mahasiswa();
M.setNpm(txnpm.getText());
M.setNama(txnama.getText());
M.setAlamat(alamat.getText());
simpanData(M);
}
private void btdelAksi(ActionEvent evt)
{ int status;
status = JOptionPane.showConfirmDialog(null, "Yakin data akan dihapus", "Konfirmasi", JOptionPane.OK_CANCEL_OPTION);
if(status == 0) {
hapusData(txnpm.getText());
}
}
private void btubhAksi(ActionEvent evt)
{ Mahasiswa M = new Mahasiswa();
M.setNpm(txnpm.getText());
M.setNama(txnama.getText());
M.setAlamat(alamat.getText());
ubahData(M, tab.getValueAt(tab.getSelectedRow(), 0).toString());
}
private void tabMouseClicked(MouseEvent evt) {
btubh.setEnabled(true);
btdel.setEnabled(true);
btadd.setEnabled(false);
String npm, nama, alt;
npm = tab.getValueAt(tab.getSelectedRow(), 0).toString();
nama = tab.getValueAt(tab.getSelectedRow(), 1).toString();
alt = tab.getValueAt(tab.getSelectedRow(), 2).toString();
txnpm.setText(npm);
txnama.setText(nama);
alamat.setText(alt);
}
public static void main(String [] args)
{ new FormMahasiswa().loadData();
}
}