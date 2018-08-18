package cn.fishy.plugin.idea.auto;

import cn.fishy.plugin.idea.auto.storage.Env;
import cn.fishy.plugin.idea.auto.ui.GeneratorMainDialog;
import com.intellij.openapi.actionSystem.AnActionEvent;

public class ShowDialog extends com.intellij.openapi.actionSystem.AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        Env.project = e.getProject();
        GeneratorMainDialog dialog = new GeneratorMainDialog();
        dialog.pack();
        dialog.setVisible(true);
    }
}
