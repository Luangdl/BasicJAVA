package thread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TelaTimeThread extends JDialog {

    private JPanel jpanel = new JPanel(new GridBagLayout()); // Painel de componentes

    private JLabel descricaoHora = new JLabel("Nome");
    private JTextField mostraTempo = new JTextField();

    private JLabel descricaoHora2 = new JLabel("E-mail");
    private JTextField mostraTempo2 = new JTextField();

    private JButton jButton = new JButton("Add Lista");
    private JButton jButton2 = new JButton("Stop");


    private ImplementacaoFilaThread fila = new ImplementacaoFilaThread();


    public TelaTimeThread() { // Construtor executa o que tiver dentro no momento da abertura ou execucao

        setTitle("Minha tela de time com thread");
        setSize(new Dimension(260, 240));
        setLocationRelativeTo(null);
        setResizable(false);

        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new Insets(5, 10 ,5 ,5);
        gridBagConstraints.anchor = GridBagConstraints.WEST;

        descricaoHora.setPreferredSize( new Dimension(200, 25));
        jpanel.add(descricaoHora, gridBagConstraints);

        mostraTempo.setPreferredSize(new Dimension(200, 25));
        gridBagConstraints.gridy ++;
        jpanel.add(mostraTempo, gridBagConstraints);

        descricaoHora2.setPreferredSize( new Dimension(200, 25));
        gridBagConstraints.gridy ++;
        jpanel.add(descricaoHora2, gridBagConstraints);

        mostraTempo2.setPreferredSize(new Dimension(200, 25));
        gridBagConstraints.gridy ++;
        jpanel.add(mostraTempo2, gridBagConstraints);

        gridBagConstraints.gridwidth = 1;

        jButton.setPreferredSize(new Dimension(92, 25));
        gridBagConstraints.gridy ++;
        jpanel.add(jButton, gridBagConstraints);

        jButton2.setPreferredSize(new Dimension(92, 25));
        gridBagConstraints.gridx ++;
        jpanel.add(jButton2, gridBagConstraints);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { /*Executa o clique no botão*/

                ObjetoFilaThread filaThread = new ObjetoFilaThread();
                filaThread.setNome(mostraTempo.getText());
                filaThread.setEmail(mostraTempo2.getText());

                fila.add(filaThread);

            }
        });

        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                fila.stop();

            }
        });


        fila.start();
        add(jpanel, BorderLayout.WEST);
        setVisible(true);// Torna a tela visivel, sempre será o último comando.
    }


}
