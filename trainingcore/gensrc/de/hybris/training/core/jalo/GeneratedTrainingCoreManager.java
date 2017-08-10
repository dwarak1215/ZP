/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Aug 10, 2017 7:48:48 PM                     ---
 * ----------------------------------------------------------------
 *  
 * [y] hybris Platform
 *  
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 *  
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 *  
 */
package de.hybris.training.core.jalo;

import de.hybris.platform.basecommerce.jalo.site.BaseSite;
import de.hybris.platform.cms2.jalo.site.CMSSite;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LItem;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.link.Link;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.util.Utilities;
import de.hybris.training.core.constants.TrainingCoreConstants;
import de.hybris.training.core.jalo.ApparelMixedPack;
import de.hybris.training.core.jalo.ApparelMultiVariantProduct;
import de.hybris.training.core.jalo.ApparelProduct;
import de.hybris.training.core.jalo.ElectronicsColorVariantProduct;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type <code>TrainingCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTrainingCoreManager extends Extension
{
	/** Relation ordering override parameter constants for Country2ProductRelation from ((trainingcore))*/
	protected static String COUNTRY2PRODUCTRELATION_SRC_ORDERED = "relation.Country2ProductRelation.source.ordered";
	protected static String COUNTRY2PRODUCTRELATION_TGT_ORDERED = "relation.Country2ProductRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for Country2ProductRelation from ((trainingcore))*/
	protected static String COUNTRY2PRODUCTRELATION_MARKMODIFIED = "relation.Country2ProductRelation.markmodified";
	/** Relation ordering override parameter constants for Site2ProductRelation from ((trainingcore))*/
	protected static String SITE2PRODUCTRELATION_SRC_ORDERED = "relation.Site2ProductRelation.source.ordered";
	protected static String SITE2PRODUCTRELATION_TGT_ORDERED = "relation.Site2ProductRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for Site2ProductRelation from ((trainingcore))*/
	protected static String SITE2PRODUCTRELATION_MARKMODIFIED = "relation.Site2ProductRelation.markmodified";
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public ApparelMixedPack createApparelMixedPack(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.APPARELMIXEDPACK );
			return (ApparelMixedPack)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelMixedPack : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelMixedPack createApparelMixedPack(final Map attributeValues)
	{
		return createApparelMixedPack( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelMultiVariantProduct createApparelMultiVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.APPARELMULTIVARIANTPRODUCT );
			return (ApparelMultiVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelMultiVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelMultiVariantProduct createApparelMultiVariantProduct(final Map attributeValues)
	{
		return createApparelMultiVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelProduct createApparelProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.APPARELPRODUCT );
			return (ApparelProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelProduct createApparelProduct(final Map attributeValues)
	{
		return createApparelProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.ELECTRONICSCOLORVARIANTPRODUCT );
			return (ElectronicsColorVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ElectronicsColorVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final Map attributeValues)
	{
		return createElectronicsColorVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return TrainingCoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productEligibleCountries</code> attribute.
	 * @return the productEligibleCountries
	 */
	public Collection<Country> getProductEligibleCountries(final SessionContext ctx, final Product item)
	{
		final List<Country> items = item.getLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.COUNTRY2PRODUCTRELATION,
			"Country",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productEligibleCountries</code> attribute.
	 * @return the productEligibleCountries
	 */
	public Collection<Country> getProductEligibleCountries(final Product item)
	{
		return getProductEligibleCountries( getSession().getSessionContext(), item );
	}
	
	public long getProductEligibleCountriesCount(final SessionContext ctx, final Product item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			TrainingCoreConstants.Relations.COUNTRY2PRODUCTRELATION,
			"Country",
			null
		);
	}
	
	public long getProductEligibleCountriesCount(final Product item)
	{
		return getProductEligibleCountriesCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productEligibleCountries</code> attribute. 
	 * @param value the productEligibleCountries
	 */
	public void setProductEligibleCountries(final SessionContext ctx, final Product item, final Collection<Country> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.COUNTRY2PRODUCTRELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(COUNTRY2PRODUCTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productEligibleCountries</code> attribute. 
	 * @param value the productEligibleCountries
	 */
	public void setProductEligibleCountries(final Product item, final Collection<Country> value)
	{
		setProductEligibleCountries( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to productEligibleCountries. 
	 * @param value the item to add to productEligibleCountries
	 */
	public void addToProductEligibleCountries(final SessionContext ctx, final Product item, final Country value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.COUNTRY2PRODUCTRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(COUNTRY2PRODUCTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to productEligibleCountries. 
	 * @param value the item to add to productEligibleCountries
	 */
	public void addToProductEligibleCountries(final Product item, final Country value)
	{
		addToProductEligibleCountries( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from productEligibleCountries. 
	 * @param value the item to remove from productEligibleCountries
	 */
	public void removeFromProductEligibleCountries(final SessionContext ctx, final Product item, final Country value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.COUNTRY2PRODUCTRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(COUNTRY2PRODUCTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from productEligibleCountries. 
	 * @param value the item to remove from productEligibleCountries
	 */
	public void removeFromProductEligibleCountries(final Product item, final Country value)
	{
		removeFromProductEligibleCountries( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productEligibleSites</code> attribute.
	 * @return the productEligibleSites
	 */
	public Collection<CMSSite> getProductEligibleSites(final SessionContext ctx, final Product item)
	{
		final List<CMSSite> items = item.getLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.SITE2PRODUCTRELATION,
			"CMSSite",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productEligibleSites</code> attribute.
	 * @return the productEligibleSites
	 */
	public Collection<CMSSite> getProductEligibleSites(final Product item)
	{
		return getProductEligibleSites( getSession().getSessionContext(), item );
	}
	
	public long getProductEligibleSitesCount(final SessionContext ctx, final Product item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			TrainingCoreConstants.Relations.SITE2PRODUCTRELATION,
			"CMSSite",
			null
		);
	}
	
	public long getProductEligibleSitesCount(final Product item)
	{
		return getProductEligibleSitesCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productEligibleSites</code> attribute. 
	 * @param value the productEligibleSites
	 */
	public void setProductEligibleSites(final SessionContext ctx, final Product item, final Collection<CMSSite> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.SITE2PRODUCTRELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(SITE2PRODUCTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productEligibleSites</code> attribute. 
	 * @param value the productEligibleSites
	 */
	public void setProductEligibleSites(final Product item, final Collection<CMSSite> value)
	{
		setProductEligibleSites( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to productEligibleSites. 
	 * @param value the item to add to productEligibleSites
	 */
	public void addToProductEligibleSites(final SessionContext ctx, final Product item, final CMSSite value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.SITE2PRODUCTRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SITE2PRODUCTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to productEligibleSites. 
	 * @param value the item to add to productEligibleSites
	 */
	public void addToProductEligibleSites(final Product item, final CMSSite value)
	{
		addToProductEligibleSites( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from productEligibleSites. 
	 * @param value the item to remove from productEligibleSites
	 */
	public void removeFromProductEligibleSites(final SessionContext ctx, final Product item, final CMSSite value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.SITE2PRODUCTRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SITE2PRODUCTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from productEligibleSites. 
	 * @param value the item to remove from productEligibleSites
	 */
	public void removeFromProductEligibleSites(final Product item, final CMSSite value)
	{
		removeFromProductEligibleSites( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Country.productsForCountries</code> attribute.
	 * @return the productsForCountries
	 */
	public Collection<Product> getProductsForCountries(final SessionContext ctx, final Country item)
	{
		final List<Product> items = item.getLinkedItems( 
			ctx,
			true,
			TrainingCoreConstants.Relations.COUNTRY2PRODUCTRELATION,
			"Product",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Country.productsForCountries</code> attribute.
	 * @return the productsForCountries
	 */
	public Collection<Product> getProductsForCountries(final Country item)
	{
		return getProductsForCountries( getSession().getSessionContext(), item );
	}
	
	public long getProductsForCountriesCount(final SessionContext ctx, final Country item)
	{
		return item.getLinkedItemsCount(
			ctx,
			true,
			TrainingCoreConstants.Relations.COUNTRY2PRODUCTRELATION,
			"Product",
			null
		);
	}
	
	public long getProductsForCountriesCount(final Country item)
	{
		return getProductsForCountriesCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Country.productsForCountries</code> attribute. 
	 * @param value the productsForCountries
	 */
	public void setProductsForCountries(final SessionContext ctx, final Country item, final Collection<Product> value)
	{
		item.setLinkedItems( 
			ctx,
			true,
			TrainingCoreConstants.Relations.COUNTRY2PRODUCTRELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(COUNTRY2PRODUCTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Country.productsForCountries</code> attribute. 
	 * @param value the productsForCountries
	 */
	public void setProductsForCountries(final Country item, final Collection<Product> value)
	{
		setProductsForCountries( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to productsForCountries. 
	 * @param value the item to add to productsForCountries
	 */
	public void addToProductsForCountries(final SessionContext ctx, final Country item, final Product value)
	{
		item.addLinkedItems( 
			ctx,
			true,
			TrainingCoreConstants.Relations.COUNTRY2PRODUCTRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(COUNTRY2PRODUCTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to productsForCountries. 
	 * @param value the item to add to productsForCountries
	 */
	public void addToProductsForCountries(final Country item, final Product value)
	{
		addToProductsForCountries( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from productsForCountries. 
	 * @param value the item to remove from productsForCountries
	 */
	public void removeFromProductsForCountries(final SessionContext ctx, final Country item, final Product value)
	{
		item.removeLinkedItems( 
			ctx,
			true,
			TrainingCoreConstants.Relations.COUNTRY2PRODUCTRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(COUNTRY2PRODUCTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from productsForCountries. 
	 * @param value the item to remove from productsForCountries
	 */
	public void removeFromProductsForCountries(final Country item, final Product value)
	{
		removeFromProductsForCountries( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSSite.productsForCountries</code> attribute.
	 * @return the productsForCountries
	 */
	public Collection<Product> getProductsForCountries(final SessionContext ctx, final CMSSite item)
	{
		final List<Product> items = item.getLinkedItems( 
			ctx,
			true,
			TrainingCoreConstants.Relations.SITE2PRODUCTRELATION,
			"Product",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSSite.productsForCountries</code> attribute.
	 * @return the productsForCountries
	 */
	public Collection<Product> getProductsForCountries(final CMSSite item)
	{
		return getProductsForCountries( getSession().getSessionContext(), item );
	}
	
	public long getProductsForCountriesCount(final SessionContext ctx, final CMSSite item)
	{
		return item.getLinkedItemsCount(
			ctx,
			true,
			TrainingCoreConstants.Relations.SITE2PRODUCTRELATION,
			"Product",
			null
		);
	}
	
	public long getProductsForCountriesCount(final CMSSite item)
	{
		return getProductsForCountriesCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CMSSite.productsForCountries</code> attribute. 
	 * @param value the productsForCountries
	 */
	public void setProductsForCountries(final SessionContext ctx, final CMSSite item, final Collection<Product> value)
	{
		item.setLinkedItems( 
			ctx,
			true,
			TrainingCoreConstants.Relations.SITE2PRODUCTRELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(SITE2PRODUCTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CMSSite.productsForCountries</code> attribute. 
	 * @param value the productsForCountries
	 */
	public void setProductsForCountries(final CMSSite item, final Collection<Product> value)
	{
		setProductsForCountries( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to productsForCountries. 
	 * @param value the item to add to productsForCountries
	 */
	public void addToProductsForCountries(final SessionContext ctx, final CMSSite item, final Product value)
	{
		item.addLinkedItems( 
			ctx,
			true,
			TrainingCoreConstants.Relations.SITE2PRODUCTRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SITE2PRODUCTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to productsForCountries. 
	 * @param value the item to add to productsForCountries
	 */
	public void addToProductsForCountries(final CMSSite item, final Product value)
	{
		addToProductsForCountries( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from productsForCountries. 
	 * @param value the item to remove from productsForCountries
	 */
	public void removeFromProductsForCountries(final SessionContext ctx, final CMSSite item, final Product value)
	{
		item.removeLinkedItems( 
			ctx,
			true,
			TrainingCoreConstants.Relations.SITE2PRODUCTRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SITE2PRODUCTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from productsForCountries. 
	 * @param value the item to remove from productsForCountries
	 */
	public void removeFromProductsForCountries(final CMSSite item, final Product value)
	{
		removeFromProductsForCountries( getSession().getSessionContext(), item, value );
	}
	
}
