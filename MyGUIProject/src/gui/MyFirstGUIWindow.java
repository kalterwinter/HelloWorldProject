package gui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import data.Person;

import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.events.MouseEvent;

public class MyFirstGUIWindow {

	protected Shell shlFrWindow;
	private Text vornameTF;
	private Text nachnameTF;
	private Text strasseTF;
	private Text hausnummerTF;
	private Text plzTF;
	private Text ortTF;
	private Label nachnameL;
	private Label strasseL;
	private Label hausnummerL;
	private Label plzL;
	private Label ortL;
	private Label VornameOut;
	private Label NachnameOut;
	private Label StrasseOut;
	private Label HausnummerOut;
	private Label PlzOut;
	private Label OrtOut;
	private Button btnJson;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MyFirstGUIWindow window = new MyFirstGUIWindow();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlFrWindow.open();
		shlFrWindow.layout();
		while (!shlFrWindow.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlFrWindow = new Shell();
		shlFrWindow.setImage(SWTResourceManager.getImage("\\\\kk-gym-pfs\\profiledataschueler\\rafael.winter\\Documents\\Eigene Bilder\\blauen-windows-hintergrund-mit-runden-windows-logo.jpg"));
		shlFrWindow.setBackgroundImage(SWTResourceManager.getImage("\\\\kk-gym-pfs\\profiledataschueler\\rafael.winter\\Documents\\Eigene Bilder\\linee-blu-streal-sfondo-per-il-desktop_1017-3768.jpg"));
		shlFrWindow.setSize(450, 300);
		shlFrWindow.setText("FR Window");
		
		Button btnNewButton_1 = new Button(shlFrWindow, SWT.NONE);
		btnNewButton_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		btnNewButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println("Knoppe gedrückt.");
				System.out.println(vornameTF.getText());
				System.out.println(nachnameTF.getText());
				System.out.println(strasseTF.getText());
				System.out.println(hausnummerTF.getText());
				System.out.println(plzTF.getText());
				System.out.println(ortTF.getText());
				//
				getVornameOut().setText(getVornameTF().getText());
				getNachnameOut().setText(getNachnameTF().getText());
				getStrasseOut().setText(getStrasseTF().getText());
				getHausnummerOut().setText(getHausnummerTF().getText());
				getplzOut().setText(getPlzTF().getText());
				getOrtOut().setText(getOrtTF().getText());
				//
				Person p1; // Variablen Definition
				p1 = new Person(); // Instanzierung
				//
				p1.setVorname(getVornameTF().getText());
				p1.setNachname(getNachnameTF().getText());
				//
				System.out.println(p1);
				//
				Person.getListe().add(p1);
				//
				System.out.println(Person.getListe());
				// alle felder loeschen
				getVornameTF().setText("");
				getNachnameTF().setText("");
			}
		});
		btnNewButton_1.setBounds(10, 10, 75, 25);
		btnNewButton_1.setText("My Button");
		
		Button btnAbbrechen = new Button(shlFrWindow, SWT.NONE);
		btnAbbrechen.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		btnAbbrechen.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.exit(0);
			}
		});
		btnAbbrechen.setBounds(91, 10, 75, 25);
		btnAbbrechen.setText("Abbrechen");
		
		vornameTF = new Text(shlFrWindow, SWT.BORDER);
		vornameTF.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		vornameTF.setBounds(142, 59, 142, 21);
		
		nachnameTF = new Text(shlFrWindow, SWT.BORDER);
		nachnameTF.setBounds(142, 86, 142, 21);
		
		strasseTF = new Text(shlFrWindow, SWT.BORDER);
		strasseTF.setBounds(142, 113, 142, 21);
		
		hausnummerTF = new Text(shlFrWindow, SWT.BORDER);
		hausnummerTF.setBounds(142, 140, 142, 21);
		
		plzTF = new Text(shlFrWindow, SWT.BORDER);
		plzTF.setBounds(142, 167, 142, 21);
		
		ortTF = new Text(shlFrWindow, SWT.BORDER);
		ortTF.setBounds(142, 194, 142, 21);
		
		Label vornameL = new Label(shlFrWindow, SWT.NONE);
		vornameL.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		vornameL.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		vornameL.setBounds(58, 62, 55, 15);
		vornameL.setText("Vorname");
		
		nachnameL = new Label(shlFrWindow, SWT.NONE);
		nachnameL.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		nachnameL.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		nachnameL.setBounds(58, 92, 58, 15);
		nachnameL.setText("Nachname");
		
		strasseL = new Label(shlFrWindow, SWT.NONE);
		strasseL.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		strasseL.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		strasseL.setBounds(58, 119, 55, 15);
		strasseL.setText("Stra\u00DFe");
		
		hausnummerL = new Label(shlFrWindow, SWT.NONE);
		hausnummerL.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		hausnummerL.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		hausnummerL.setBounds(58, 146, 78, 15);
		hausnummerL.setText("Hausnummer");
		
		plzL = new Label(shlFrWindow, SWT.NONE);
		plzL.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		plzL.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		plzL.setBounds(58, 173, 55, 15);
		plzL.setText("PLZ");
		
		ortL = new Label(shlFrWindow, SWT.NONE);
		ortL.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		ortL.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		ortL.setBounds(58, 200, 55, 15);
		ortL.setText("Ort");
		
		Composite composite = new Composite(shlFrWindow, SWT.NONE);
		composite.setBackgroundImage(SWTResourceManager.getImage("C:\\Users\\rafael.winter\\Downloads\\2557e7b05283907.jpg"));
		composite.addMouseMoveListener(new MouseMoveListener() {
			public void mouseMove(MouseEvent me) {
				System.out.println(me.x + "/" + me.y);
			}
		});
		composite.setBounds(334, 10, 91, 36);
		
		VornameOut = new Label(shlFrWindow, SWT.NONE);
		VornameOut.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		VornameOut.setBounds(312, 59, 112, 21);
		
		NachnameOut = new Label(shlFrWindow, SWT.NONE);
		NachnameOut.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		NachnameOut.setBounds(312, 86, 112, 21);
		
		StrasseOut = new Label(shlFrWindow, SWT.NONE);
		StrasseOut.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		StrasseOut.setBounds(312, 113, 112, 21);
		
		HausnummerOut = new Label(shlFrWindow, SWT.NONE);
		HausnummerOut.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		HausnummerOut.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		HausnummerOut.setBounds(312, 140, 112, 21);
		
		PlzOut = new Label(shlFrWindow, SWT.NONE);
		PlzOut.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		PlzOut.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		PlzOut.setBounds(312, 167, 112, 21);
		
		OrtOut = new Label(shlFrWindow, SWT.NONE);
		OrtOut.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		OrtOut.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		OrtOut.setBounds(312, 194, 112, 21);
		
		btnJson = new Button(shlFrWindow, SWT.NONE);
		btnJson.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Gson gson = new GsonBuilder().setPrettyPrinting().create();
				//
				//System.out.print(gson.toJson(Person.getListe()));
				try {
					File jsonFile = File.createTempFile("wpfinf-json-",".humptydumpty");
					FileWriter fw = new FileWriter(jsonFile);
					//
					gson.toJson(Person.getListe(), fw);
					//
					fw.flush();
					fw.close();
					//
					//explorer öffnen
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnJson.setBounds(172, 10, 75, 25);
		btnJson.setText("Json");
		
		Button btnLoad = new Button(shlFrWindow, SWT.NONE);
		btnLoad.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				FileDialog fd = new FileDialog(shlFrWindow,SWT.OPEN);
				fd.setFileName("WPF-JSON");
				fd.setFilterExtensions(new String[] {".humptydumpty"});
				fd.setFilterPath("%TEMP%");
				//
				fd.open();
			}
		});
		btnLoad.setBounds(253, 10, 75, 25);
		btnLoad.setText("Load");
		shlFrWindow.setTabList(new Control[]{vornameTF, nachnameTF, strasseTF, hausnummerTF, plzTF, ortTF, btnNewButton_1});

	}
	public Text getVornameTF() {
		return vornameTF;
	}
	public Text getNachnameTF() {
		return nachnameTF;
	}
	public Label getVornameOut() {
		return VornameOut;
	}
	public Label getNachnameOut() {
		return NachnameOut;
	}
	public Label getHausnummerOut() {
		return HausnummerOut;
	}
	public Label getplzOut() {
		return PlzOut;
	}
	public Label getOrtOut() {
		return OrtOut;
	}
	public Label getStrasseOut() {
		return StrasseOut;
	}
	public Text getStrasseTF() {
		return strasseTF;
	}
	public Text getHausnummerTF() {
		return hausnummerTF;
	}
	public Text getPlzTF() {
		return plzTF;
	}
	public Text getOrtTF() {
		return ortTF;
	}
}
