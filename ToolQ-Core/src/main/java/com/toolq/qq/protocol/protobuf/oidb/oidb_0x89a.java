package com.toolq.qq.protocol.protobuf.oidb;

import com.qq.pb.*;

public class oidb_0x89a {
    public static final class ReqBody extends MessageMicro<ReqBody> {
        static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[]{8, 18, 24, 32}, new String[]{"uint64_group_code", "st_group_info", "uint64_original_operator_uin", "uint32_req_group_open_appid"}, new Object[]{0L, null, 0L, 0}, ReqBody.class);
        public oidb_0x89a.groupinfo st_group_info = new oidb_0x89a.groupinfo();
        public final PBUInt32Field uint32_req_group_open_appid = PBField.initUInt32(0);
        public final PBUInt64Field uint64_group_code = PBField.initUInt64(0);
        public final PBUInt64Field uint64_original_operator_uin = PBField.initUInt64(0);
    }

    public static final class groupinfo extends MessageMicro<groupinfo> {
        static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[]{8, 16, 26, 34, 42, 50, 58, 66, 72, 80, 88, 98, 106, 114, 120, 128, 136, 144, 154, 162, 168, 178, 184, 192, 202, 208, 216, 224, 232, 242, 250, 256, 264, 272, 280, 288, 296, 304, 312, 320, 328, 336, 344, 354, 362}, new String[]{"uint32_group_ext_adm_num", "uint32_flag", "string_group_name", "string_group_memo", "string_group_finger_memo", "string_group_aio_skin_url", "string_group_board_skin_url", "string_group_cover_skin_url", "uint32_group_grade", "uint32_active_member_num", "uint32_certification_type", "string_certification_text", "string_group_rich_finger_memo", "st_group_newguidelines", "uint32_group_face", "uint32_add_option", "uint32_shutup_time", "uint32_group_type_flag", "rpt_string_group_tag", "msg_group_geo_info", "uint32_group_class_ext", "string_group_class_text", "uint32_app_privilege_flag", "uint32_app_privilege_mask", "st_group_ex_info", "uint32_group_sec_level", "uint32_group_sec_level_info", "uint64_subscription_uin", "uint32_allow_member_invite", "string_group_question", "string_group_answer", "uint32_group_flagext3", "uint32_group_flagext3_mask", "uint32_group_open_appid", "uint32_no_finger_open_flag", "uint32_no_code_finger_open_flag", "uint64_root_id", "uint32_msg_limit_frequency", "uint32_hl_guild_appid", "uint32_hl_guild_sub_type", "uint32_hl_guild_orgid", "uint32_group_flagext4", "uint32_group_flagext4_mask", "bytes_group_school_info", "st_group_card_prefix"}, new Object[]{0, 0, ByteStringMicro.EMPTY, ByteStringMicro.EMPTY, ByteStringMicro.EMPTY, ByteStringMicro.EMPTY, ByteStringMicro.EMPTY, ByteStringMicro.EMPTY, 0, 0, 0, ByteStringMicro.EMPTY, ByteStringMicro.EMPTY, null, 0, 0, 0, 0, ByteStringMicro.EMPTY, null, 0, ByteStringMicro.EMPTY, 0, 0, null, 0, 0, 0L, 0, ByteStringMicro.EMPTY, ByteStringMicro.EMPTY, 0, 0, 0, 0, 0, 0L, 0, 0, 0, 0, 0, 0, ByteStringMicro.EMPTY, null}, groupinfo.class);
        public final PBBytesField bytes_group_school_info = PBField.initBytes(ByteStringMicro.EMPTY);
        public oidb_0x89a.GroupGeoInfo msg_group_geo_info = new oidb_0x89a.GroupGeoInfo();
        public final PBRepeatField<ByteStringMicro> rpt_string_group_tag = PBField.initRepeat(PBBytesField.__repeatHelper__);
        public oidb_0x89a.GroupCardPrefix st_group_card_prefix = new oidb_0x89a.GroupCardPrefix();
        public oidb_0x89a.GroupExInfoOnly st_group_ex_info = new oidb_0x89a.GroupExInfoOnly();
        public oidb_0x89a.GroupNewGuidelinesInfo st_group_newguidelines = new oidb_0x89a.GroupNewGuidelinesInfo();
        public final PBBytesField string_certification_text = PBField.initBytes(ByteStringMicro.EMPTY);
        public final PBBytesField string_group_aio_skin_url = PBField.initBytes(ByteStringMicro.EMPTY);
        public final PBBytesField string_group_answer = PBField.initBytes(ByteStringMicro.EMPTY);
        public final PBBytesField string_group_board_skin_url = PBField.initBytes(ByteStringMicro.EMPTY);
        public final PBBytesField string_group_class_text = PBField.initBytes(ByteStringMicro.EMPTY);
        public final PBBytesField string_group_cover_skin_url = PBField.initBytes(ByteStringMicro.EMPTY);
        public final PBBytesField string_group_finger_memo = PBField.initBytes(ByteStringMicro.EMPTY);
        public final PBBytesField string_group_memo = PBField.initBytes(ByteStringMicro.EMPTY);
        public final PBBytesField string_group_name = PBField.initBytes(ByteStringMicro.EMPTY);
        public final PBBytesField string_group_question = PBField.initBytes(ByteStringMicro.EMPTY);
        public final PBBytesField string_group_rich_finger_memo = PBField.initBytes(ByteStringMicro.EMPTY);
        public final PBUInt32Field uint32_active_member_num = PBField.initUInt32(0);
        public final PBUInt32Field uint32_add_option = PBField.initUInt32(0);
        public final PBUInt32Field uint32_allow_member_invite = PBField.initUInt32(0);
        public final PBUInt32Field uint32_app_privilege_flag = PBField.initUInt32(0);
        public final PBUInt32Field uint32_app_privilege_mask = PBField.initUInt32(0);
        public final PBUInt32Field uint32_certification_type = PBField.initUInt32(0);
        public final PBUInt32Field uint32_flag = PBField.initUInt32(0);
        public final PBUInt32Field uint32_group_class_ext = PBField.initUInt32(0);
        public final PBUInt32Field uint32_group_ext_adm_num = PBField.initUInt32(0);
        public final PBUInt32Field uint32_group_face = PBField.initUInt32(0);
        public final PBUInt32Field uint32_group_flagext3 = PBField.initUInt32(0);
        public final PBUInt32Field uint32_group_flagext3_mask = PBField.initUInt32(0);
        public final PBUInt32Field uint32_group_flagext4 = PBField.initUInt32(0);
        public final PBUInt32Field uint32_group_flagext4_mask = PBField.initUInt32(0);
        public final PBUInt32Field uint32_group_grade = PBField.initUInt32(0);
        public final PBUInt32Field uint32_group_open_appid = PBField.initUInt32(0);
        public final PBUInt32Field uint32_group_sec_level = PBField.initUInt32(0);
        public final PBUInt32Field uint32_group_sec_level_info = PBField.initUInt32(0);
        public final PBUInt32Field uint32_group_type_flag = PBField.initUInt32(0);
        public final PBUInt32Field uint32_hl_guild_appid = PBField.initUInt32(0);
        public final PBUInt32Field uint32_hl_guild_orgid = PBField.initUInt32(0);
        public final PBUInt32Field uint32_hl_guild_sub_type = PBField.initUInt32(0);
        public final PBUInt32Field uint32_msg_limit_frequency = PBField.initUInt32(0);
        public final PBUInt32Field uint32_no_code_finger_open_flag = PBField.initUInt32(0);
        public final PBUInt32Field uint32_no_finger_open_flag = PBField.initUInt32(0);
        public final PBUInt32Field uint32_shutup_time = PBField.initUInt32(0);
        public final PBUInt64Field uint64_root_id = PBField.initUInt64(0);
        public final PBUInt64Field uint64_subscription_uin = PBField.initUInt64(0);
    }

    public static final class RspBody extends MessageMicro<RspBody> {
        static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[]{8, 18}, new String[]{"uint64_group_code", "str_errorinfo"}, new Object[]{0L, ByteStringMicro.EMPTY}, RspBody.class);
        public final PBBytesField str_errorinfo = PBField.initBytes(ByteStringMicro.EMPTY);
        public final PBUInt64Field uint64_group_code = PBField.initUInt64(0);

        @Override
        public String toString() {
            return "RspBody{" +
                    "str_errorinfo=" + str_errorinfo +
                    ", uint64_group_code=" + uint64_group_code +
                    '}';
        }
    }

    public static final class GroupNewGuidelinesInfo extends MessageMicro<GroupNewGuidelinesInfo> {
        static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[]{8, 18}, new String[]{"bool_enabled", "string_content"}, new Object[]{false, ByteStringMicro.EMPTY}, GroupNewGuidelinesInfo.class);
        public final PBBoolField bool_enabled = PBField.initBool(false);
        public final PBBytesField string_content = PBField.initBytes(ByteStringMicro.EMPTY);
    }

    public static final class GroupExInfoOnly extends MessageMicro<GroupExInfoOnly> {
        static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[]{8, 16}, new String[]{"uint32_tribe_id", "uint32_money_for_add_group"}, new Object[]{0, 0}, GroupExInfoOnly.class);
        public final PBUInt32Field uint32_money_for_add_group = PBField.initUInt32(0);
        public final PBUInt32Field uint32_tribe_id = PBField.initUInt32(0);
    }

    public static final class GroupCardPrefix extends MessageMicro<GroupCardPrefix> {
        static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[]{10, 18}, new String[]{"bytes_introduction", "rpt_bytes_prefix"}, new Object[]{ByteStringMicro.EMPTY, ByteStringMicro.EMPTY}, GroupCardPrefix.class);
        public final PBBytesField bytes_introduction = PBField.initBytes(ByteStringMicro.EMPTY);
        public final PBRepeatField<ByteStringMicro> rpt_bytes_prefix = PBField.initRepeat(PBBytesField.__repeatHelper__);
    }

    public static final class GroupGeoInfo extends MessageMicro<GroupGeoInfo> {
        static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[]{8, 16, 24, 34, 40}, new String[]{"uint32_city_id", "uint64_longtitude", "uint64_latitude", "string_geo_content", "uint64_poi_id"}, new Object[]{0, 0L, 0L, ByteStringMicro.EMPTY, 0L}, GroupGeoInfo.class);
        public final PBBytesField string_geo_content = PBField.initBytes(ByteStringMicro.EMPTY);
        public final PBUInt32Field uint32_city_id = PBField.initUInt32(0);
        public final PBUInt64Field uint64_latitude = PBField.initUInt64(0);
        public final PBUInt64Field uint64_longtitude = PBField.initUInt64(0);
        public final PBUInt64Field uint64_poi_id = PBField.initUInt64(0);
    }
}
