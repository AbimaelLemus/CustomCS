package com.easyapp.customcs.util

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.Button
import androidx.fragment.app.DialogFragment
import com.easyapp.customcs.R
import com.easyapp.customcs.databinding.DialogRegistroBinding

class DialogRegistro : DialogFragment(), DialogInterface.OnShowListener {

    private var binding: DialogRegistroBinding? = null

    private var positiveButton: Button? = null
    private var negativeButton: Button? = null
    private val TAG = "DialogRegistro"

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        activity?.let { activity ->
            binding = DialogRegistroBinding.inflate(LayoutInflater.from(context))
            binding?.let {
                /*val builder = AlertDialog.Builder(activity)
                    .setTitle("Agregar producto")
                    .setPositiveButton("Agregar", null)
                    .setNegativeButton("Cancelar", null)
                    .setView(it.root)

                val dialog = builder.create()
                dialog.setOnShowListener(this)
                return dialog*/

                val dialog = AlertDialog.Builder(activity)
                    .setView(it.root)
                    .create()
                //.setCancelable(false)
                //dialog.setCancelable(false)
                dialog.setOnShowListener(this)
                return dialog

                /*return Dialog(requireContext(), R.style.Theme_App_Dialog_FullScreen).apply {
                    setContentView(binding!!.root)
                    setCancelable(false)
                    setCanceledOnTouchOutside(false)
                }*/

            }
        }
        return super.onCreateDialog(savedInstanceState)
    }

    override fun onShow(dialoginterface: DialogInterface?) {
        val dialog = dialog as? AlertDialog

        dialog?.let {
            dialog.setCancelable(true)
            ////positiveButton = it.getButton(Dialog.BUTTON_POSITIVE)
            negativeButton = it.getButton(Dialog.BUTTON_NEGATIVE)

            positiveButton?.setOnClickListener {
                binding?.let {
                }
            }
            negativeButton?.setOnClickListener {
                dismiss()
            }

            binding!!.apply {
                btnLogin.setOnClickListener {
                    dismiss()
                    Log.e(TAG, "onShow: btnLogin")
                }

                btnRegistro.setOnClickListener {
                    dismiss()
                    Log.e(TAG, "onShow: btnRegistro")
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}