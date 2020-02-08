import javax.swing.*;
import java.awt.*;
class RegistroNullLayout extends JFrame{
	public RegistroNullLayout() {
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Actividad 2");
		setSize(900,575);
		setLocationRelativeTo(null);
		setVisible(true);

		JLabel c1 = new JLabel();
		c1.setText("The Classic Form includes all visible fields for");
						// x   y   anchura altura
		c1.setBounds(20, 15, 270, 30);
		add(c1);
		JLabel c11 = new JLabel("this list"); 
		c11.setBounds(20, 35, 270, 30);
		add(c11);
		
		JLabel c22 = new JLabel("Form Options.");
		c22.setBounds(20, 65, 270, 30);
		add(c22);

		JLabel c3 = new JLabel("Include the Following: ");
		c3.setBounds(20, 85, 270, 30);
		add(c3);
		
		JCheckBox c4 = new JCheckBox(" a title for your form"); 
		c4.setBounds(15, 105, 270, 30);
		add(c4);
		
		JTextField cajaTexto = new JTextField("Suscribe to our maling list");
		cajaTexto.setBounds(19, 135, 270, 30);
		add(cajaTexto); 
		
		ButtonGroup b1 = new ButtonGroup(); 
		JRadioButton only = new JRadioButton("only"); 
		b1.add(only);
		only.setBounds(15, 190, 270, 30);
		add(only);
		JRadioButton all = new JRadioButton("all fields"); 
		b1.add(all);
		all.setBounds(15, 215, 270, 30);
		add(all);
		
		JLabel edit = new JLabel("(edit requerid fields in the form builder)");
		edit.setBounds(27, 234, 270, 30);
		add(edit);
		
		JCheckBox grs = new JCheckBox(" interests groups fields "); 
		grs.setBounds(15, 260, 270, 30);
		add(grs);
		JCheckBox fl = new JCheckBox(" requiered field indicators "); 
		fl.setBounds(15, 282, 270, 30);
		add(fl);
		
		JLabel set = new JLabel(" Set form width ");
		set.setBounds(13, 320, 270, 30);
		add(set);
		JTextField cajaTexto2 = new JTextField();
		cajaTexto2.setBounds(15, 348, 270, 30);
		add(cajaTexto2); 
		
		JLabel enlace = new JLabel("Enlace your form");
		enlace.setBounds(15, 383, 270, 30);
		add(enlace);
		
		JCheckBox uno = new JCheckBox(" enable evil poppup mode "); 
		uno.setBounds(11, 413, 270, 30);
		add(uno);
		JCheckBox dos = new JCheckBox(" disable all JavaScript "); 
		dos.setBounds(11, 437, 270, 30);
		add(dos);
		JCheckBox tres = new JCheckBox(" include archive link "); 
		tres.setBounds(11, 461, 270, 30);
		add(tres);
		JCheckBox cuatro = new JCheckBox(" include MonkeyRewards link "); 
		cuatro.setBounds(11, 485, 270, 30);
		add(cuatro);
		
		JLabel rw = new JLabel();
		rw.setText("Preview");
		rw.setBounds(325, 15, 270, 30);
		add(rw);
		
		//Panel Email Adrees
		JPanel panelIzq = new JPanel(); 
		panelIzq.setLayout(new FlowLayout());
		panelIzq.setBorder(BorderFactory.createTitledBorder("Email Adress"));
		panelIzq.add(new JTextField(45));
		panelIzq.setBounds(320, 50, 544, 60);
		panelIzq.add(new JLabel());
		add(panelIzq);
		
		//Panel First Name
		JPanel fn = new JPanel(); 
		fn.setLayout(new FlowLayout());
		fn.setBorder(BorderFactory.createTitledBorder("First Name"));
		fn.add(new JTextField(45));
		fn.setBounds(320, 110, 544, 60);
		fn.add(new JLabel());
		add(fn);
		
		//Panel Last Name
		JPanel ln = new JPanel(); 
		ln.setLayout(new FlowLayout());
		ln.setBorder(BorderFactory.createTitledBorder("Last Name"));
		ln.add(new JTextField(45));
		ln.setBounds(320, 175, 544, 60);
		ln.add(new JLabel());
		add(ln);
		
		JButton boton; 
		ImageIcon imagen; 
		Icon icono; 
		Container contapane = getContentPane(); 
		contapane.setLayout(null);
		this.setVisible(true);
		boton = new JButton(); 
		boton.setBounds(322, 250, 100, 27);
		imagen = new ImageIcon("1.png"); 
		icono = new ImageIcon(imagen.getImage().getScaledInstance(boton.getWidth(), boton.getHeight(), Image.SCALE_DEFAULT));
		boton.setIcon(icono);
		contapane.add(boton);
		
		JLabel copyPaste = new JLabel("Copy/paste onto your site"); 
		copyPaste.setBounds(322, 300, 270, 30);
		add(copyPaste);
		String urls[] = {"</form>", "</div", "<script type='type/javascript' src='//s3.amazonaws.com/downloads.mailchimp.com/js/mc-",
				"validate.js'></script type='text/javascript'>(function($){window.fnames = new",
				"Array();window.ftypes = new", "Array();fnames[0]='EMAIL';ftypes[0]='email';fnames[1]='FNAME';ftypes[1]='text';fnames[2]='L",
				"NAME';ftypes[2]='text';}(jQuery));var %mcj = JQuery.noConflict(true);</script>",
				"<!--End mc_embed_signup-->"};
		JList<String> listUrls = new JList(urls); 
		listUrls.setVisibleRowCount(1);
		//add(listaActividades);
		JScrollPane scroll = new JScrollPane(listUrls); 
		scroll.setBounds(322, 330, 544, 100);
		add(scroll); 
	}
}//class
public class PruebaAct2 {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new RegistroNullLayout();
			}
		});
	}
}