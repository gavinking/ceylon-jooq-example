/**
 * This class is generated by jOOQ
 */
package gen.example.jooq.tables;


import ceylon.language.String;

import com.github.bjansen.ceylon.jooqadapter.StringConverter;

import gen.example.jooq.Sakila;
import gen.example.jooq.tables.records.NicerButSlowerFilmListRecord;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
import org.jooq.types.UShort;


/**
 * VIEW
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.0"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NicerButSlowerFilmList extends TableImpl<NicerButSlowerFilmListRecord> {

	private static final long serialVersionUID = -207930609;

	/**
	 * The reference instance of <code>sakila.nicer_but_slower_film_list</code>
	 */
	public static final NicerButSlowerFilmList nicerButSlowerFilmList = new NicerButSlowerFilmList();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<NicerButSlowerFilmListRecord> getRecordType() {
		return NicerButSlowerFilmListRecord.class;
	}

	/**
	 * The column <code>sakila.nicer_but_slower_film_list.FID</code>.
	 */
	public final TableField<NicerButSlowerFilmListRecord, UShort> fid = createField("FID", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED.defaulted(true), this, "");

	/**
	 * The column <code>sakila.nicer_but_slower_film_list.title</code>.
	 */
	public final TableField<NicerButSlowerFilmListRecord, String> title = createField("title", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "", new StringConverter());

	/**
	 * The column <code>sakila.nicer_but_slower_film_list.description</code>.
	 */
	public final TableField<NicerButSlowerFilmListRecord, java.lang.String> description = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>sakila.nicer_but_slower_film_list.category</code>.
	 */
	public final TableField<NicerButSlowerFilmListRecord, String> category = createField("category", org.jooq.impl.SQLDataType.VARCHAR.length(25).nullable(false), this, "", new StringConverter());

	/**
	 * The column <code>sakila.nicer_but_slower_film_list.price</code>.
	 */
	public final TableField<NicerButSlowerFilmListRecord, BigDecimal> price = createField("price", org.jooq.impl.SQLDataType.DECIMAL.precision(4, 2).defaulted(true), this, "");

	/**
	 * The column <code>sakila.nicer_but_slower_film_list.length</code>.
	 */
	public final TableField<NicerButSlowerFilmListRecord, UShort> length = createField("length", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED, this, "");

	/**
	 * The column <code>sakila.nicer_but_slower_film_list.rating</code>.
	 */
	public final TableField<NicerButSlowerFilmListRecord, java.lang.String> rating = createField("rating", org.jooq.impl.SQLDataType.VARCHAR.length(5).defaulted(true), this, "");

	/**
	 * The column <code>sakila.nicer_but_slower_film_list.actors</code>.
	 */
	public final TableField<NicerButSlowerFilmListRecord, java.lang.String> actors = createField("actors", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * Create a <code>sakila.nicer_but_slower_film_list</code> table reference
	 */
	public NicerButSlowerFilmList() {
		this("nicer_but_slower_film_list", null);
	}

	/**
	 * Create an aliased <code>sakila.nicer_but_slower_film_list</code> table reference
	 */
	public NicerButSlowerFilmList(java.lang.String alias) {
		this(alias, nicerButSlowerFilmList);
	}

	private NicerButSlowerFilmList(java.lang.String alias, Table<NicerButSlowerFilmListRecord> aliased) {
		this(alias, aliased, null);
	}

	private NicerButSlowerFilmList(java.lang.String alias, Table<NicerButSlowerFilmListRecord> aliased, Field<?>[] parameters) {
		super(alias, Sakila.sakila, aliased, parameters, "VIEW");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public NicerButSlowerFilmList as(java.lang.String alias) {
		return new NicerButSlowerFilmList(alias, this);
	}

	/**
	 * Rename this table
	 */
	public NicerButSlowerFilmList rename(java.lang.String name) {
		return new NicerButSlowerFilmList(name, null);
	}
}
