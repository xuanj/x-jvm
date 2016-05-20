package showtime;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IStartup;

/**
 * @author xuanjian
 *
 */
public class ShowTime implements IStartup {

	@Override
	public void earlyStartup() {
		Display.getDefault().syncExec(new Runnable() {
			
			@Override
			public void run() {
				long st = Long.parseLong(System.getProperty("eclipse.startTime"));
				long ct = System.currentTimeMillis() - st;
				Shell shell = Display.getDefault().getActiveShell();
				String message = "Eclipsey启动耗时：" + ct + "ms";
				MessageDialog.openInformation(shell, "Information", message );
				
			}
		});

	}

}
