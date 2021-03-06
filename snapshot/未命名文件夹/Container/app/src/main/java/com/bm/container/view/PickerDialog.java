package com.bm.container.view;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.bm.container.R;

import java.util.ArrayList;
import java.util.List;

/**
 * 下方滚动选择Dialog
 *
 * @author nfmomo
 */
public class PickerDialog extends Dialog {

    public PickerDialog(Context context) {
        super(context);
    }

    public PickerDialog(Context context, int theme) {
        super(context, theme);
    }

    public static class Builder {
        private Context context;
        private String titleName;
        private OnClickListener cancelListener;
        private OnClickListener sureListener;

        private TextView cancel;
        private TextView title;
        private TextView sure;
        private PickerView picker;
        private int pickeroPsition = 1;

        private List<String> data = new ArrayList<String>();

        public Builder(Context context) {
            this.context = context;
        }

        public Builder setTitle(String titleName) {
            this.titleName = titleName;
            return this;
        }

        public Builder setData(List<String> data) {
            this.data = data;
            return this;
        }

        public Builder setCancel(OnClickListener listener) {
            this.cancelListener = listener;
            return this;
        }

        public Builder setSure(OnClickListener listener) {
            this.sureListener = listener;
            return this;
        }

        public PickerDialog create() {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            final PickerDialog dialog = new PickerDialog(context, R.style.OptionButtonDialog);
            View layout = inflater.inflate(R.layout.dialog_scrollpicker, null);

            title = (TextView) layout.findViewById(R.id.tv_picker_title);
            title.setText(titleName);

            picker = (PickerView) layout.findViewById(R.id.pv_picker);
            if (data.size() <= 2) {
                pickeroPsition = 0;
            } else {
                pickeroPsition = 1;
            }
            picker.setData(data);
            picker.setOnSelectListener((text, position) -> pickeroPsition = position);

            cancel = (TextView) layout.findViewById(R.id.tv_picker_cancel);
            cancel.setOnClickListener(v -> cancelListener.onClick(dialog, pickeroPsition));
            sure = (TextView) layout.findViewById(R.id.tv_picker_sure);
            sure.setOnClickListener(v -> sureListener.onClick(dialog, pickeroPsition));

            Window win = dialog.getWindow();
            win.getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams lp = win.getAttributes();
            lp.width = WindowManager.LayoutParams.FILL_PARENT;
            lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
            win.setAttributes(lp);

            dialog.setContentView(layout);
            return dialog;
        }

    }
}
