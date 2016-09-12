package com.baml.h4h.sample.model;

import javax.xml.bind.annotation.XmlRootElement;

import com.backendless.Backendless;
import com.backendless.BackendlessCollection;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.gnani.data.Future;
import com.backendless.persistence.BackendlessDataQuery;

@XmlRootElement
public class need
{
  private java.util.Date created;
  private java.util.Date updated;
  private String objectId;
  private String ownerId;
  private Double price;
  private Integer id;
  private String description;
  public java.util.Date getCreated()
  {
    return created;
  }

  public java.util.Date getUpdated()
  {
    return updated;
  }

  public String getObjectId()
  {
    return objectId;
  }

  public String getOwnerId()
  {
    return ownerId;
  }

  public Double getPrice()
  {
    return price;
  }

  public void setPrice( Double price )
  {
    this.price = price;
  }

  public Integer getId()
  {
    return id;
  }

  public void setId( Integer id )
  {
    this.id = id;
  }

  public String getDescription()
  {
    return description;
  }

  public void setDescription( String description )
  {
    this.description = description;
  }

                                                    
  public need save()
  {
    return Backendless.Data.of( need.class ).save( this );
  }

  public Future<need> saveAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<need> future = new Future<need>();
      Backendless.Data.of( need.class ).save( this, future );

      return future;
    }
  }

  public void saveAsync( AsyncCallback<need> callback )
  {
    Backendless.Data.of( need.class ).save( this, callback );
  }

  public Long remove()
  {
    return Backendless.Data.of( need.class ).remove( this );
  }

  public Future<Long> removeAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Long> future = new Future<Long>();
      Backendless.Data.of( need.class ).remove( this, future );

      return future;
    }
  }

  public void removeAsync( AsyncCallback<Long> callback )
  {
    Backendless.Data.of( need.class ).remove( this, callback );
  }

  public static need findById( String id )
  {
    return Backendless.Data.of( need.class ).findById( id );
  }

  public static Future<need> findByIdAsync( String id )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<need> future = new Future<need>();
      Backendless.Data.of( need.class ).findById( id, future );

      return future;
    }
  }

  public static void findByIdAsync( String id, AsyncCallback<need> callback )
  {
    Backendless.Data.of( need.class ).findById( id, callback );
  }

  public static need findFirst()
  {
    return Backendless.Data.of( need.class ).findFirst();
  }

  public static Future<need> findFirstAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<need> future = new Future<need>();
      Backendless.Data.of( need.class ).findFirst( future );

      return future;
    }
  }

  public static void findFirstAsync( AsyncCallback<need> callback )
  {
    Backendless.Data.of( need.class ).findFirst( callback );
  }

  public static need findLast()
  {
    return Backendless.Data.of( need.class ).findLast();
  }

  public static Future<need> findLastAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<need> future = new Future<need>();
      Backendless.Data.of( need.class ).findLast( future );

      return future;
    }
  }

  public static void findLastAsync( AsyncCallback<need> callback )
  {
    Backendless.Data.of( need.class ).findLast( callback );
  }

  public static BackendlessCollection<need> find( BackendlessDataQuery query )
  {
    return Backendless.Data.of( need.class ).find( query );
  }

  public static Future<BackendlessCollection<need>> findAsync( BackendlessDataQuery query )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<BackendlessCollection<need>> future = new Future<BackendlessCollection<need>>();
      Backendless.Data.of( need.class ).find( query, future );

      return future;
    }
  }

  public static void findAsync( BackendlessDataQuery query, AsyncCallback<BackendlessCollection<need>> callback )
  {
    Backendless.Data.of( need.class ).find( query, callback );
  }
}