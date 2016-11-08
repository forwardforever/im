/**
 * Copyright (C) 2016 Hyphenate Inc. All rights reserved.
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package yebob.com.im.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import yebob.com.im.R;
/**
 * 联系人列表页
 */
public class ContactFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.em_contacts, null);
        Button bt_add_friend = (Button) view.findViewById(R.id.bt_add_friend);
        Button bt_msg = (Button) view.findViewById(R.id.bt_msg);
        TextView tv_chat1 = (TextView) view.findViewById(R.id.tv_chat1);
        TextView tv_chat2 = (TextView) view.findViewById(R.id.tv_chat2);
        TextView tv_chat3 = (TextView) view.findViewById(R.id.tv_chat3);
        onClick(bt_add_friend, bt_msg, tv_chat1, tv_chat2, tv_chat3);
        return view;
    }

    private void onClick(Button bt_add_friend, Button bt_msg, TextView tv_chat1, TextView tv_chat2, TextView tv_chat3) {
        tv_chat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "来吧点击哟", Toast.LENGTH_SHORT).show();
                String username = "xiao";
                // demo中直接进入聊天页面，实际一般是进入用户详情页
                startActivity(new Intent(getActivity(), ChatActivity.class).putExtra("userId", username));
            }
        });
        tv_chat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "来吧", Toast.LENGTH_SHORT).show();
                String username = "xixi";
                // demo中直接进入聊天页面，实际一般是进入用户详情页
                startActivity(new Intent(getActivity(), ChatActivity.class).putExtra("userId", username));
            }
        });
        tv_chat3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "来吧", Toast.LENGTH_SHORT).show();
                String username = "sisi";
                // demo中直接进入聊天页面，实际一般是进入用户详情页
                startActivity(new Intent(getActivity(), ChatActivity.class).putExtra("userId", username));
            }
        });
        //进入添加好友页面
        bt_add_friend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), AddContactActivity.class));
            }
        });
        bt_msg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 进入申请与通知页面
                startActivity(new Intent(getActivity(), NewFriendsMsgActivity.class));
            }
        });
    }


}
