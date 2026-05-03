import javax.swing.*;
import java.awt.event.*;

public class NilaiGUI extends JFrame {
    JRadioButton rbPemlan, rbASD, rbMatkomlan, rbProbstat;
    JTextField tfTugas, tfKuis, tfUTS, tfUAS, tfHasil;
    JTextArea taHasil;
    JButton btnHitung, btnTampil;

    MataKuliah mk;

    double nilaiPemlan, nilaiASD, nilaiMatkomlan, nilaiProbstat;

    public NilaiGUI() {
        setTitle("Hitung Nilai Akhir");
        setSize(400, 500);
        setLayout(null);

        JLabel title = new JLabel("Hitung Nilai Akhir");
        title.setBounds(120, 10, 200, 20);
        add(title);

        // radio button
        rbASD = new JRadioButton("ASD");
        rbPemlan = new JRadioButton("Pemlan");
        rbMatkomlan = new JRadioButton("Matkomlan");
        rbProbstat = new JRadioButton("Probstat");

        ButtonGroup bg = new ButtonGroup();
        bg.add(rbASD);
        bg.add(rbPemlan);
        bg.add(rbMatkomlan);
        bg.add(rbProbstat);

        rbASD.setBounds(20, 40, 80, 20);
        rbPemlan.setBounds(100, 40, 100, 20);
        rbMatkomlan.setBounds(200, 40, 120, 20);
        rbProbstat.setBounds(20, 70, 100, 20);

        add(rbASD);
        add(rbPemlan);
        add(rbMatkomlan);
        add(rbProbstat);

        // label
        addLabel("Tugas :", 20, 110);
        addLabel("Kuis :", 20, 140);
        addLabel("UTS :", 20, 170);
        addLabel("UAS :", 20, 200);
        addLabel("Hasil :", 20, 230);

        // input
        tfTugas = addTextField(100, 110);
        tfKuis = addTextField(100, 140);
        tfUTS = addTextField(100, 170);
        tfUAS = addTextField(100, 200);
        tfHasil = addTextField(100, 230);
        tfHasil.setEditable(false);

        // tombol itung
        btnHitung = new JButton("Hitung");
        btnHitung.setBounds(120, 270, 120, 25);
        add(btnHitung);

        // area teks
        JLabel lblArea = new JLabel("HASIL NILAI SEMUA MATA KULIAH");
        lblArea.setBounds(20, 300, 300, 20);
        add(lblArea);

        taHasil = new JTextArea();
        JScrollPane sp = new JScrollPane(taHasil);
        sp.setBounds(20, 320, 340, 100);
        add(sp);

        // tombol tampil
        btnTampil = new JButton("Tampilkan nilai semua matkul");
        btnTampil.setBounds(60, 430, 260, 25);
        add(btnTampil);

        // clear field
        ActionListener clear = e -> {
            tfTugas.setText("");
            tfKuis.setText("");
            tfUTS.setText("");
            tfUAS.setText("");
            tfHasil.setText("");
        };

        rbASD.addActionListener(clear);
        rbPemlan.addActionListener(clear);
        rbMatkomlan.addActionListener(clear);
        rbProbstat.addActionListener(clear);

        // itung
        btnHitung.addActionListener(e -> {
            try {
                double t = Double.parseDouble(tfTugas.getText());
                double k = Double.parseDouble(tfKuis.getText());
                double uts = Double.parseDouble(tfUTS.getText());
                double uas = Double.parseDouble(tfUAS.getText());

                if (rbPemlan.isSelected()) {
                    mk = new Pemlan();
                    nilaiPemlan = mk.hitungNilai(t, k, uts, uas);
                } else if (rbASD.isSelected()) {
                    mk = new ASD();
                    nilaiASD = mk.hitungNilai(t, k, uts, uas);
                } else if (rbMatkomlan.isSelected()) {
                    mk = new Matkomlan();
                    nilaiMatkomlan = mk.hitungNilai(t, k, uts, uas);
                } else if (rbProbstat.isSelected()) {
                    mk = new Probstat();
                    nilaiProbstat = mk.hitungNilai(t, k, uts, uas);
                } else {
                    JOptionPane.showMessageDialog(null, "Pilih mata kuliah!");
                    return;
                }

                double hasil = mk.hitungNilai(t, k, uts, uas);
                tfHasil.setText(String.format("%.1f", hasil));

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Input harus angka!");
            }
        });

        // liat smw
        btnTampil.addActionListener(e -> {
            taHasil.setText("");
            taHasil.append("Pemlan : " + nilaiPemlan + "\n");
            taHasil.append("ASD : " + nilaiASD + "\n");
            taHasil.append("Matkomlan : " + nilaiMatkomlan + "\n");
            taHasil.append("Probstat : " + nilaiProbstat + "\n");
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    void addLabel(String text, int x, int y) {
        JLabel l = new JLabel(text);
        l.setBounds(x, y, 80, 20);
        add(l);
    }

    JTextField addTextField(int x, int y) {
        JTextField tf = new JTextField();
        tf.setBounds(x, y, 100, 20);
        add(tf);
        return tf;
    }

    public static void main(String[] args) {
        new NilaiGUI();
    }
}