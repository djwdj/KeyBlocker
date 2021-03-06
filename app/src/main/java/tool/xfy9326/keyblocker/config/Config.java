package tool.xfy9326.keyblocker.config;

/**
 * KeyBlocker.git
 * Created by frowhy on 2017/3/13.
 */

public class Config {
    public static final int NOTIFICATION_ID = 5000;

    public static final String EMPTY_ARRAY = "[]";

    public static final String CLOSE_SERVICE = "CLOSE_SERVICE";
    public static final String TEST_APP_NAME = "TEST_APP_NAME";
    public static final String AUTO_BLOCK = "AUTO_BLOCK";

    public static final int REQUEST_CODE_READ_PHONE_STAT = 1;

    public static final String APPWIDGET_CLICK_ACTION = "tool.xfy9326.keyblocker.action.APPWIDGET_CLICK_ACTION";
    public static final String APPWIDGET_UPDATE_ACTION = "tool.xfy9326.keyblocker.action.APPWIDGET_UPDATE_ACTION";
    public static final String REMOTE_CONTROL_ACTION = "tool.xfy9326.keyblocker.action.REMOTE_CONTROL_ACTION";
    public static final String ACTIVITY_AND_PACKAGE_TEST_ACTION = "tool.xfy9326.keyblocker.action.ACTIVITY_AND_PACKAGE_TEST";
    public static final String NOTIFICATION_CLICK_ACTION = "tool.xfy9326.keyblocker.Notification.OnClick";
    public static final String NOTIFICATION_DELETE_ACTION = "tool.xfy9326.keyblocker.Notification.OnDelete";

    public static final String ENABLED_CUSTOM_KEYCODE = "EnabledCustomKeycode";
    public static final String CUSTOM_SETTINGS = "CustomSettings";
    public static final String ENABLED_VOLUME_KEY = "EnabledVolumeKey";
    public static final String CUSTOM_KEYCODE = "CustomKeycode";
    public static final String DISPLAY_KEYCODE = "DisplayKeycode";
    public static final String ENABLED_KEYBLOCK = "EnabledKeyBlock";
    public static final String DISPLAY_APPWIDGET = "DisplayAppWidget";
    public static final String ROOT_FUNCTION = "RootFunction";
    public static final String ROOT_OPEN_SERVICE = "RootOpenService";
    public static final String BUTTON_VIBRATE = "ButtonVibrate";
    public static final String DISPLAY_NOTIFICATION = "DisplayNotification";
    public static final String NOTIFICATION_ICON = "NotificationIcon";
    public static final String REMOVE_NOTIFICATION = "RemoveNotification";
    public static final String AUTO_CLOSE_STATUSBAR = "AutoCloseStatusBar";
    public static final String KEYBLOCK_ACTIVITY = "KeyBlockActivity";
    public static final String KEYBLOCK_ACTIVITY_ADVANCED_SCAN_MODE = "KeyBlockActivityAdvancedScanMode";
    public static final String KEYBLOCK_ACTIVITY_LIST_SET = "KeyBlockActivityListSet";
    public static final String KEYBLOCK_ACTIVITY_TEXT_SET = "KeyBlockActivityTextSet";
    public static final String KEYBLOCK_ACTIVITY_TEST = "KeyBlockActivityTest";
    public static final String CUSTOM_KEYBLOCK_ACTIVITY = "CustomKeyBlockActivity";
    public static final String CUSTOM_KEYBLOCK_ACTIVITY_KEY_WORDS = "CustomKeyBlockActivityKeyWords";
    public static final String CONTROL_NOTIFICATION = "ControlNotification";
    public static final String KEYBLOCK_ACTIVITY_FILTER = "KeyBlockActivityFilter";
    public static final String DOUBLE_CLICK_EXIT = "DoubleClickExit";
    public static final String ROOT_SCAN_ACTIVITY = "RootScanActivity";
    public static final String RECENT_BLOCK_REMEMBER = "RecentBlockRemember";
    public static final String CLOSE_ADVANCED_FUNCTIONS = "CloseAdvancedFunctions";

    public static final String RUNTIME_BUTTONLIGHT_ON = "echo 100 > /sys/class/leds/button-backlight/brightness";
    public static final String RUNTIME_BUTTONLIGHT_OFF = "echo 0 > /sys/class/leds/button-backlight/brightness";
    public static final String RUNTIME_BUTTONLIGHT_CHMOD_STICK = "chmod 444 /sys/class/leds/button-backlight/brightness";
    public static final String RUNTIME_BUTTONLIGHT_CHMOD_CHANGE = "chmod 644 /sys/class/leds/button-backlight/brightness";
    public static final String RUNTIME_VIBRATE_ON = "echo 100 > /sys/class/timed_output/vibrator/vtg_level";
    public static final String RUNTIME_VIBRATE_OFF = "echo 0 > /sys/class/timed_output/vibrator/vtg_level";
    public static final String RUNTIME_VIBRATE_CHMOD_STICK = "chmod 444 /sys/class/timed_output/vibrator/vtg_level";
    public static final String RUNTIME_VIBRATE_CHMOD_CHANGE = "chmod 644 /sys/class/timed_output/vibrator/vtg_level";
    public static final String RUNTIME_VIBRATE_CHMOD_AVOIDCHANGE_STICK = "chmod 444 /sys/class/timed_output/vibrator/enable";
    public static final String RUNTIME_VIBRATE_CHMOD_AVOIDCHANGE_CHANGE = "chmod 644 /sys/class/timed_output/vibrator/enable";
    public static final String RUNTIME_GET_CURRENT_ACTIVITY = "dumpsys activity | grep \"mFocusedActivity\"";

    public static final String RUNTIME_ROOT_OPEN_SERVICE_REGISTER = "settings put secure enabled_accessibility_services tool.xfy9326.keyblocker/tool.xfy9326.keyblocker.service.KeyBlockService";
    public static final String RUNTIME_ROOT_OPEN_SERVICE_OPEN_REFRESH = "settings put secure accessibility_enabled 1";
    public static final String RUNTIME_ROOT_OPEN_SERVICE_CLOSE_REFRESH = "settings put secure accessibility_enabled 0";
}
