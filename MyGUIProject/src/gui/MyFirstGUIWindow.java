package gui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;
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
			}
		});
		btnNewButton_1.setBounds(41, 10, 75, 25);
		btnNewButton_1.setText("My Button");
		
		Button btnAbbrechen = new Button(shlFrWindow, SWT.NONE);
		btnAbbrechen.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		btnAbbrechen.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.exit(0);
			}
		});
		btnAbbrechen.setBounds(122, 10, 75, 25);
		btnAbbrechen.setText("Abbrechen");
		
		vornameTF = new Text(shlFrWindow, SWT.BORDER);
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
		composite.setBackgroundImage(SWTResourceManager.getImage("\\\\kk-gym-pfs\\profiledataschueler\\rafael.winter\\Documents\\Eigene Bilder\\Marelli_logo.png"));
		composite.addMouseMoveListener(new MouseMoveListener() {
			public void mouseMove(MouseEvent me) {
				System.out.println(me.x + "/" + me.y);
			}
		});
		composite.setBounds(290, 181, 134, 70);
		shlFrWindow.setTabList(new Control[]{vornameTF, nachnameTF, strasseTF, hausnummerTF, plzTF, ortTF, btnNewButton_1});

	}
}
