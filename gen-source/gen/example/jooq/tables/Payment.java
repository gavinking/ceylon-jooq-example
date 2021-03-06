/**
 * This class is generated by jOOQ
 */
package gen.example.jooq.tables;


import gen.example.jooq.Keys;
import gen.example.jooq.Sakila;
import gen.example.jooq.tables.records.PaymentRecord;

import java.math.BigDecimal;
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
import org.jooq.types.UByte;
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
public class Payment extends TableImpl<PaymentRecord> {

	private static final long serialVersionUID = 893794291;

	/**
	 * The reference instance of <code>sakila.payment</code>
	 */
	public static final Payment payment = new Payment();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<PaymentRecord> getRecordType() {
		return PaymentRecord.class;
	}

	/**
	 * The column <code>sakila.payment.payment_id</code>.
	 */
	public final TableField<PaymentRecord, UShort> paymentId = createField("payment_id", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>sakila.payment.customer_id</code>.
	 */
	public final TableField<PaymentRecord, UShort> customerId = createField("customer_id", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>sakila.payment.staff_id</code>.
	 */
	public final TableField<PaymentRecord, UByte> staffId = createField("staff_id", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>sakila.payment.rental_id</code>.
	 */
	public final TableField<PaymentRecord, Integer> rentalId = createField("rental_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>sakila.payment.amount</code>.
	 */
	public final TableField<PaymentRecord, BigDecimal> amount = createField("amount", org.jooq.impl.SQLDataType.DECIMAL.precision(5, 2).nullable(false), this, "");

	/**
	 * The column <code>sakila.payment.payment_date</code>.
	 */
	public final TableField<PaymentRecord, Timestamp> paymentDate = createField("payment_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

	/**
	 * The column <code>sakila.payment.last_update</code>.
	 */
	public final TableField<PaymentRecord, Timestamp> lastUpdate = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>sakila.payment</code> table reference
	 */
	public Payment() {
		this("payment", null);
	}

	/**
	 * Create an aliased <code>sakila.payment</code> table reference
	 */
	public Payment(String alias) {
		this(alias, payment);
	}

	private Payment(String alias, Table<PaymentRecord> aliased) {
		this(alias, aliased, null);
	}

	private Payment(String alias, Table<PaymentRecord> aliased, Field<?>[] parameters) {
		super(alias, Sakila.sakila, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<PaymentRecord, UShort> getIdentity() {
		return Keys.IDENTITY_payment;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<PaymentRecord> getPrimaryKey() {
		return Keys.keyPaymentPrimary;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<PaymentRecord>> getKeys() {
		return Arrays.<UniqueKey<PaymentRecord>>asList(Keys.keyPaymentPrimary);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<PaymentRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<PaymentRecord, ?>>asList(Keys.fkPaymentCustomer, Keys.fkPaymentStaff, Keys.fkPaymentRental);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Payment as(String alias) {
		return new Payment(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Payment rename(String name) {
		return new Payment(name, null);
	}
}
