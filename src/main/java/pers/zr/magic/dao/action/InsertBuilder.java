package pers.zr.magic.dao.action;

import pers.zr.magic.dao.constants.ActionMode;
import pers.zr.magic.dao.feature.ShardStrategy;
import pers.zr.magic.dao.runtime.ActionTable;

/**
 * Created by zhurong on 2016-4-28.
 */
public class InsertBuilder extends ActionBuilder {

    public InsertBuilder(ActionTable table) {
        this.table = table;
    }

    public InsertBuilder(ActionTable table, ShardStrategy strategy) {
        this.table = table;
        this.shardStrategy = strategy;
    }

    @Override
    public Insert build() {

        Insert insert = new Insert();
        insert.table = this.table;
        insert.shardStrategy = this.shardStrategy;
        return insert;

    }

    @Override
    public ActionMode getActionMode() {
        return ActionMode.INSERT;
    }
}
