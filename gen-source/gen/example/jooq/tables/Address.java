/**
 * This class is generated by jOOQ
 */
package gen.example.jooq.tables;


import ceylon.language.String;

import com.github.bjansen.ceylon.jooqadapter.StringConverter;

import gen.example.jooq.Keys;
import gen.example.jooq.Sakila;
import gen.example.jooq.tables.records.AddressRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.jooq.types.UShort;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.0"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Address extends TableImpl<AddressRecord> {

	private static final long serialVersionUID = 1179149122;

	/**
	 * The reference instance of <code>sakila.address</code>
	 */
	public static final Address address = new Address();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<AddressRecord> getRecordType() {
		return AddressRecord.class;
	}

	/**
	 * The column <code>sakila.address.address_id</code>.
	 */
	public final TableField<AddressRecord, UShort> addressId = createField("address_id", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>sakila.address.address</code>.
	 */
	public final TableField<AddressRecord, String> address_ = createField("address", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "", new StringConverter());

	/**
	 * The column <code>sakila.address.address2</code>.
	 */
	public final TableField<AddressRecord, String> address2 = createField("address2", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "", new StringConverter());

	/**
	 * The column <code>sakila.address.district</code>.
	 */
	public final TableField<AddressRecord, String> district = createField("district", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "", new StringConverter());

	/**
	 * The column <code>sakila.address.city_id</code>.
	 */
	public final TableField<AddressRecord, UShort> cityId = createField("city_id", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>sakila.address.postal_code</code>.
	 */
	public final TableField<AddressRecord, String> postalCode = createField("postal_code", org.jooq.impl.SQLDataType.VARCHAR.length(10), this, "", new StringConverter());

	/**
	 * The column <code>sakila.address.phone</code>.
	 */
	public final TableField<AddressRecord, String> phone = createField("phone", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "", new StringConverter());

	/**
	 * The column <code>sakila.address.last_update</code>.
	 */
	public final TableField<AddressRecord, Timestamp> lastUpdate = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>sakila.address</code> table reference
	 */
	public Address() {
		this("address", null);
	}

	/**
	 * Create an aliased <code>sakila.address</code> table reference
	 */
	public Address(java.lang.String alias) {
		this(alias, address);
	}

	private Address(java.lang.String alias, Table<AddressRecord> aliased) {
		this(alias, aliased, null);
	}

	private Address(java.lang.String alias, Table<AddressRecord> aliased, Field<?>[] parameters) {
		super(alias, Sakila.sakila, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<AddressRecord, UShort> getIdentity() {
		return Keys.IDENTITY_address;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<AddressRecord> getPrimaryKey() {
		return Keys.keyAddressPrimary;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<AddressRecord>> getKeys() {
		return Arrays.<UniqueKey<AddressRecord>>asList(Keys.keyAddressPrimary);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<AddressRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<AddressRecord, ?>>asList(Keys.fkAddressCity);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Address as(java.lang.String alias) {
		return new Address(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Address rename(java.lang.String name) {
		return new Address(name, null);
	}
}
