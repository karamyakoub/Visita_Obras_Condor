package com.karam.visitaobra;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SelectActivity extends AppCompatActivity implements View.OnClickListener {
    String codusu,nomeusu;
    Button btn_novaobra,btn_acompanhamento,btn_cnpj,btn_cancel;
    EditText editTxt_cnpj;
    AlertDialog cnpjDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);
        setLayoutConstrols();
        setOnClickListeners();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.select_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.select_logout_menu:
                Methods.setSharedPref(this,"string",getString(R.string.sh_login_cod_usu),"");
                Methods.setSharedPref(this,"string",getString(R.string.sh_login_nome_usu),"");
                Intent loginIntent = new Intent(this,LoginActivity.class);
                startActivity(loginIntent);
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void setLayoutConstrols() {
        btn_novaobra = findViewById(R.id.select_novaobra_button);
        btn_acompanhamento = findViewById(R.id.select_acompanhamento_button);
    }

    private View setCnpjDialogControls(){
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.insert_cnpj_dialog,null);
        btn_cnpj = layout.findViewById(R.id.insertCnpj_button);
        btn_cancel = layout.findViewById(R.id.insertCnpjCancel_button);
        editTxt_cnpj = layout.findViewById(R.id.insertCnpj_editText);
        btn_cancel.setOnClickListener(SelectActivity.this);
        btn_cnpj.setOnClickListener(SelectActivity.this);
        return  layout;
    }

    private void setOnClickListeners(){
        btn_novaobra.setOnClickListener(this);
        btn_acompanhamento.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.select_novaobra_button:
                cnpjDialog = new AlertDialog.Builder(this)
                        .setView(setCnpjDialogControls())
                        .setCancelable(false)
                        .create();
                cnpjDialog.show();
                break;
            case R.id.select_acompanhamento_button:

                break;
            case R.id.insertCnpj_button:
                if(!String.valueOf(editTxt_cnpj.getText()).trim().equals("")){

                }else{
                    Toast.makeText(SelectActivity.this, "Insere o cnpj do cliente", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.insertCnpjCancel_button:
                cnpjDialog.dismiss();
                break;
        }
    }
}