package com.github.jing332.tts_server_android.help.config

import android.content.Context
import com.chibatching.kotpref.KotprefModel
import com.github.jing332.tts_server_android.constant.CodeEditorTheme

object ScriptEditorConfig : KotprefModel() {
    override val kotprefMode: Int
        get() = Context.MODE_MULTI_PROCESS
    override val kotprefName = "script_editor"

    var isRemoteSyncEnabled by booleanPref(false)
    var remoteSyncPort by intPref(4566)

    var codeEditorTheme by intPref(CodeEditorTheme.AUTO)
    var isCodeEditorWordWrapEnabled by booleanPref(false)
}