package edu.cnm.deepdive.lofistudio.model.entity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

/**
 * The type Playlist.
 */
@Entity(
    indices = @Index(value = "name", unique = true)
)
public class Playlist {

  @PrimaryKey(autoGenerate = true)
  @ColumnInfo(name = "playlist_id")
  private long id;

  @NonNull
  @ColumnInfo(collate = ColumnInfo.NOCASE)
  private String name = "";

  /**
   * Gets id.
   *
   * @return the id
   */
  public long getId() {
    return id;
  }

  /**
   * Sets id.
   *
   * @param id the id
   */
  public void setId(long id) {
    this.id = id;
  }

  /**
   * Gets name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Sets name.
   *
   * @param name the name
   */
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public int hashCode() {
    return name.toLowerCase().hashCode();
  }

  @Override
  public boolean equals(@Nullable Object obj) {
    return (obj == this)
        || (obj instanceof Playlist && name.equalsIgnoreCase(((Playlist)obj).name));
  }

  @NonNull
  @Override
  public String toString() {
    return name;
  }
}


