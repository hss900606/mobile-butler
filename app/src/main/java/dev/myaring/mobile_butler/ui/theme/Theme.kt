package dev.myaring.mobile_butler.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

private val MbDarkColorScheme = darkColorScheme(
    primary = MbPrimary,
    onPrimary = MbOnPrimary,

    primaryContainer = MbSurfaceContainer,
    onPrimaryContainer = MbOnSurface,

    secondary = MbOnSurfaceVariant,
    onSecondary = MbBackground,

    tertiary = MbRecordDone,
    onTertiary = MbOnTertiary,

    background = MbBackground,
    onBackground = MbOnBackground,

    surface = MbBackground,
    onSurface = MbOnSurface,

    surfaceVariant = MbSurfaceVariant,
    onSurfaceVariant = MbOnSurfaceVariant,

    surfaceContainer = MbSurfaceContainer,
    surfaceContainerLow = MbBackground,
    surfaceContainerHigh = MbSurfaceVariant,

    surfaceBright = MbSurfaceVariant,
    surfaceDim = MbBackground,

    outline = MbOutline,
    outlineVariant = MbOutlineVariant,

    error = MbError,
    onError = MbOnError
)

@Composable
fun MobilebutlerTheme(
    darkTheme: Boolean = true,
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = if (dynamicColor) {
        dynamicDarkColorScheme(LocalContext.current)
    } else {
        MbDarkColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        shapes = MbShapes,
        content = content
    )
}