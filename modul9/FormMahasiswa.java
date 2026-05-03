import javax.swing.*;
import java.awt.*;

public class FormMahasiswa extends JFrame {

    JTextField tfNama, tfTTL, tfNoDaftar, tfTelp, tfEmail;
    JTextArea taAlamat;
    JButton btnSubmit;

    public FormMahasiswa() {
        setTitle("Form Data Mahasiswa");
        setSize(400, 420);
        setLayout(null);

        // label
        addLabel("Nama Lengkap", 20, 20);
        addLabel("Tanggal Lahir", 20, 60);
        addLabel("No. Pendaftaran", 20, 100);
        addLabel("No. Telp", 20, 140);
        addLabel("Alamat", 20, 180);
        addLabel("E-mail", 20, 250);

        // inputan
        tfNama = addTextField(170, 20);
        tfTTL = addTextField(170, 60);
        tfNoDaftar = addTextField(170, 100);
        tfTelp = addTextField(170, 140);
        tfEmail = addTextField(170, 250);

        taAlamat = new JTextArea();
        taAlamat.setBounds(170, 180, 150, 50);
        add(taAlamat);

        // tombol submit
        btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(140, 310, 100, 30);
        add(btnSubmit);

        // event
        btnSubmit.addActionListener(e -> {
            if (isKosong()) {
                JOptionPane.showMessageDialog(null, "Semua kolom harus diisi!");
                return;
            }

            int confirm = JOptionPane.showConfirmDialog(
                    null,
                    "Apakah anda yakin data yang Anda isi sudah benar?",
                    "Konfirmasi",
                    JOptionPane.OK_CANCEL_OPTION);

            if (confirm == JOptionPane.OK_OPTION) {
                tampilData();
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // memvalidasi
    boolean isKosong() {
        return tfNama.getText().trim().isEmpty() ||
                tfTTL.getText().trim().isEmpty() ||
                tfNoDaftar.getText().trim().isEmpty() ||
                tfTelp.getText().trim().isEmpty() ||
                tfEmail.getText().trim().isEmpty() ||
                taAlamat.getText().trim().isEmpty();
    }

    // jendela output
    void tampilData() {
        JFrame frame = new JFrame("Data Mahasiswa");
        frame.setSize(350, 300);
        frame.setLayout(null);

        JTextArea ta = new JTextArea();
        ta.setBounds(20, 20, 280, 220);
        ta.setEditable(false);

        // biar alamat jd 2 baris
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);

        // mau bikin titik 2nya sejajar tp dah keburu pusing maaf
        String format = "%-18s : %s\n";

        ta.setText(
                "DATA MAHASISWA\n\n" +
                        String.format(format, "Nama", tfNama.getText()) +
                        String.format(format, "Tanggal Lahir", tfTTL.getText()) +
                        String.format(format, "No. Pendaftaran", tfNoDaftar.getText()) +
                        String.format(format, "No. Telp", tfTelp.getText()) +
                        String.format(format, "Alamat", tfAlamatMultiline()) +
                        String.format(format, "E-mail", tfEmail.getText()));

        // biar bordernya kotak
        ta.setBorder(BorderFactory.createLineBorder(Color.BLUE));

        frame.add(ta);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    // biar alamatnya enak dibaca
    String tfAlamatMultiline() {
        return taAlamat.getText().replace("\n", "\n                   ");
    }

    // helper
    void addLabel(String text, int x, int y) {
        JLabel l = new JLabel(text);
        l.setBounds(x, y, 140, 20);
        add(l);
    }

    JTextField addTextField(int x, int y) {
        JTextField tf = new JTextField();
        tf.setBounds(x, y, 150, 20);
        add(tf);
        return tf;
    }

    public static void main(String[] args) {
        new FormMahasiswa();
    }
}