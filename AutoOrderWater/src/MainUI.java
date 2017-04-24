import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by ios on 17/4/18.
 */
public class MainUI {
    private JPanel            mainPanel;
    private JButton           confirm;
    private JComboBox<String> chooseDate;
    private JComboBox<String> chooseTime;
    private JTextField        lastOrderTime;
    private JButton           refresh;

    private String date;
    private String time;

    final AutoOrder autoOrder = AutoOrder.getInstance();


    public static void main(String[] args) {
        JFrame frame = new JFrame("五加仑08精品矿物质水");
        frame.setContentPane(new MainUI().mainPanel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setFocusTraversalPolicy(null);
        frame.pack();
        frame.setVisible(true);
    }

    public MainUI() {
        List<String> dates = autoOrder.getDate();
        for (String date: dates) {
            chooseDate.addItem(date);
        }
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        String currentDate = format.format(new Date());
        List<String> times = autoOrder.getTime(currentDate);
        for (String time: times) {
            chooseTime.addItem(time);
        }
        date = dates.get(0);
        time = times.get(0);

        lastOrderTime.setText(autoOrder.lastOrder());

        chooseDate.addActionListener(new ChooseDateListener());
        chooseTime.addActionListener(new ChooseTimeListener());

        confirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean success = orderWater(date, time);
                if (success) confirm.setText("订水成功");
                else confirm.setText("订水失败");

                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String currentDate = format.format(new Date());
                lastOrderTime.setText(currentDate);

                disable();
            }
        });
        refresh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lastOrderTime.setText(autoOrder.lastOrder());
            }
        });
    }

    private boolean orderWater(String date, String time) {
        return autoOrder.orderWater(date, time);
    }


    private void disable() {
        confirm.setEnabled(false);
        chooseTime.setEnabled(false);
        chooseDate.setEnabled(false);
        refresh.setEnabled(false);
    }

    public class ChooseDateListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            date = ((JComboBox)e.getSource()).getSelectedItem().toString();
            chooseTime.removeAllItems();
            List<String> times = autoOrder.getTime(date);
            for (String time: times) {
                chooseTime.addItem(time);
            }
        }
    }

    public class ChooseTimeListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Object item = ((JComboBox)e.getSource()).getSelectedItem();
            if (item != null) {
                time = item.toString();
            }
        }
    }
}
