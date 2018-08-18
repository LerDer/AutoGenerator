package cn.fishy.plugin.idea.auto.storage;

import cn.fishy.plugin.idea.auto.storage.domain.PluginProjectConfig;
import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.components.Storage;
import com.intellij.openapi.components.StoragePathMacros;
import com.intellij.openapi.components.StorageScheme;
import com.intellij.util.xmlb.XmlSerializerUtil;
import org.jetbrains.annotations.Nullable;

@com.intellij.openapi.components.State(
        name = "PluginProjectConfig",
        storages = {
                @Storage(id = "default", file = StoragePathMacros.PROJECT_FILE),
                @Storage(id = "dir", file = StoragePathMacros.PROJECT_CONFIG_DIR + "/autoProjectGenerator.xml", scheme = StorageScheme.DIRECTORY_BASED)
        }
)
public class PluginProjectConfigHolder implements PersistentStateComponent<PluginProjectConfig> {
    private PluginProjectConfig pluginProjectConfig = new PluginProjectConfig();

    @Nullable
    @Override
    public PluginProjectConfig getState() {
        return pluginProjectConfig;
    }

    @Override
    public void loadState(PluginProjectConfig state) {
        XmlSerializerUtil.copyBean(state, pluginProjectConfig);
    }

    @Nullable
    public static PluginProjectConfig getPluginProjectConfig() {
        if (Env.project == null) {
            return null;
        }
        try {
            return ServiceManager.getService(Env.project, PluginProjectConfigHolder.class).getState();
        } catch (Exception e) {
            return null;
        }
    }

}
