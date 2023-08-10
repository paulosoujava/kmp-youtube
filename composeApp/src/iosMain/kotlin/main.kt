import androidx.compose.ui.window.ComposeUIViewController
import org.evolution.app.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController {
    return  ComposeUIViewController { App() }
}
